package edu.neumont.mat305;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class SampleParser extends Parser {

	private List<Sample> samples;

	public List<Sample> getSamples() {
		return samples;
	}

	public SampleParser(File file) {
		super(file);
		samples = new ArrayList<Sample>();

	}

	// employee number, date of sample, type of sample, job code, element 1,
	// value, element 2, value, element 3 and value.
	public void parse() {
		try {
			Scanner input = new Scanner(super.file);
			while (input.hasNextLine()) {
				String sampleString = input.nextLine();
				String[] sampleStringParts = sampleString.split(" ");
				Sample sample = generateSample(sampleStringParts);
				samples.add(sample);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private Sample generateSample(String[] parts) {
		int employeeNumber = Integer.parseInt(parts[0]);
		Date date = Calendar.getInstance().getTime();
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("Mddyyyy");
			if(parts[1].length()==8)
				formatter.applyPattern("MMddyyyy");
			date = formatter.parse(parts[1]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
		SampleType sampleType = getSampleType(parts[2]);
		int jobCode = Integer.parseInt(parts[3]);
		double leadLevel = -1;
		double arsenicLevel = -1;
		double cadmiumLevel = -1;
		double hemoglobinLevel = -1;
		double zincProtoporphyrinLevel = -1;

		switch (Integer.parseInt(parts[4])) {
		case 1:
			leadLevel = Double.parseDouble(parts[5]);
			break;
		case 2:
			cadmiumLevel = Double.parseDouble(parts[5]);
			break;
		case 4:
			arsenicLevel = Double.parseDouble(parts[5]);
			break;
		case 6:
			hemoglobinLevel = Double.parseDouble(parts[5]);
			break;
		case 30:
			zincProtoporphyrinLevel = Double.parseDouble(parts[5]);
			break;
		}

		if (parts.length>8) {
			switch (Integer.parseInt(parts[6])) {
			case 1:
				leadLevel = Double.parseDouble(parts[7]);
				break;
			case 2:
				cadmiumLevel = Double.parseDouble(parts[7]);
				break;
			case 4:
				arsenicLevel = Double.parseDouble(parts[7]);
				break;
			case 6:
				hemoglobinLevel = Double.parseDouble(parts[7]);
				break;
			case 30:
				zincProtoporphyrinLevel = Double.parseDouble(parts[7]);
				break;
			}
			if (parts.length>=10) {
				switch (Integer.parseInt(parts[8])) {
				case 1:
					leadLevel = Double.parseDouble(parts[9]);
					break;
				case 2:
					cadmiumLevel = Double.parseDouble(parts[9]);
					break;
				case 4:
					arsenicLevel = Double.parseDouble(parts[9]);
					break;
				case 6:
					hemoglobinLevel = Double.parseDouble(parts[9]);
					break;
				case 30:
					zincProtoporphyrinLevel = Double.parseDouble(parts[9]);
					break;
				}
			}
		}

		return new Sample(employeeNumber, date, sampleType, jobCode, leadLevel,
				arsenicLevel, cadmiumLevel, hemoglobinLevel,
				zincProtoporphyrinLevel);

	}

	private SampleType getSampleType(String string) {
		SampleType sampleType = null;
		if (string.equals(SampleType.Blood.getValue())) {
			sampleType = SampleType.Blood;
		} else if (string.equals(SampleType.Urine.getValue())) {
			sampleType = SampleType.Urine;
		}
		return sampleType;
	}
}
