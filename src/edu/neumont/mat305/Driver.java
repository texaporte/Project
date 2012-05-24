package edu.neumont.mat305;

import java.io.File;

public class Driver {
	public static void main(String[] args) {
		File file=new File("employeedata.txt");
		SampleParser parser=new SampleParser(file);
		parser.parse();
		
	}
}
