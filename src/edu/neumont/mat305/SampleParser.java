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

	List<Sample> samples;

	public SampleParser(File file) {
		super(file);
		samples=new ArrayList<Sample>();

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
		SimpleDateFormat formatter = new SimpleDateFormat("MMDDYYYY");
		Date date=Calendar.getInstance().getTime();
		try {
			date = formatter.parse(parts[1]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
		SampleType sampleType = getSampleType(parts[2]);
		int jobCode = Integer.parseInt(parts[3]);
		int leadLevel = -1;
		int arsenicLevel=-1;
		int cadmiumLevel=-1;
		int hemoglobinLevel=-1;
		int zincProtoporphyrinLevel=-1;

		switch (Integer.parseInt(parts[4])) {
		case 1:
			leadLevel = Integer.parseInt(parts[5]);
			break;
		case 2:
			cadmiumLevel = Integer.parseInt(parts[5]);
			break;
		case 4:
			arsenicLevel = Integer.parseInt(parts[5]);
			break;
		case 6:
			hemoglobinLevel = Integer.parseInt(parts[5]);
			break;
		case 30:
			zincProtoporphyrinLevel = Integer.parseInt(parts[5]);
			break;
		}

		switch (Integer.parseInt(parts[6])) {
		case 1:
			leadLevel = Integer.parseInt(parts[7]);
			break;
		case 2:
			cadmiumLevel = Integer.parseInt(parts[7]);
			break;
		case 4:
			arsenicLevel = Integer.parseInt(parts[7]);
			break;
		case 6:
			hemoglobinLevel = Integer.parseInt(parts[7]);
			break;
		case 30:
			zincProtoporphyrinLevel = Integer.parseInt(parts[7]);
			break;
		}

		switch (Integer.parseInt(parts[8])) {
		case 1:
			leadLevel = Integer.parseInt(parts[9]);
			break;
		case 2:
			cadmiumLevel = Integer.parseInt(parts[9]);
			break;
		case 4:
			arsenicLevel = Integer.parseInt(parts[9]);
			break;
		case 6:
			hemoglobinLevel = Integer.parseInt(parts[9]);
			break;
		case 30:
			zincProtoporphyrinLevel = Integer.parseInt(parts[9]);
			break;
		}
		
		return new Sample(employeeNumber,date,sampleType,jobCode,leadLevel,arsenicLevel,cadmiumLevel,hemoglobinLevel,zincProtoporphyrinLevel);

	}

	private SampleType getSampleType(String string) {
		SampleType sampleType = null;
		if (string.equals(SampleType.Blood)) {
			sampleType = SampleType.Blood;
		} else if (string.equals(SampleType.Urine)) {
			sampleType = SampleType.Urine;
		}
		return sampleType;
	}
}
