package edu.neumont.mat305;

import java.io.File;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		File file=new File("employeedata.txt");
		SampleParser parser=new SampleParser(file);
		parser.parse();
		List<Sample> samples = parser.getSamples();
		for (Sample sample : samples) {
			System.out.println(sample);
		}
		
	}
}
