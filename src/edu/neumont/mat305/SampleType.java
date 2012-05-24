package edu.neumont.mat305;

public enum SampleType {
	Blood("B"),
	Urine("U");
	
	private String value;
	
	private SampleType(String value) {
		this.setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
