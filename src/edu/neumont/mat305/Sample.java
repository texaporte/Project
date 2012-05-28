package edu.neumont.mat305;

import java.util.Date;

public class Sample {

	private int employeeNumber;
	private Date sampleDate;
	private SampleType sampleType;
	private int jobCode;
	private double leadLevel;
	private double arsenicLevel;
	private double cadmiumLevel;
	private double hemoglobinLevel;
	private double zincpProtoporphyrinLevel;

	Sample(int employeeNumber, Date sampleDate, SampleType sampleType, int jobCode,
			double leadLevel, double arsenicLevel, double cadmiumLevel,
			double hemoglobinLevel, double zincpProtoporphyrinLevel) {
		setEmployeeNumber(employeeNumber);
		setSampleDate(sampleDate);
		setSampleType(sampleType);
		setJobCode(jobCode);
		setLeadLevel(leadLevel);
		setArsenicLevel(arsenicLevel);
		setCadmiumLevel(cadmiumLevel);
		setHemoglobinLevel(hemoglobinLevel);
		setZincpProtoporphyrinLevel(zincpProtoporphyrinLevel);
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public Date getSampleDate() {
		return sampleDate;
	}

	public SampleType getSampleType() {
		return sampleType;
	}

	public int getJobCode() {
		return jobCode;
	}

	public void setJobCode(int jobCode) {
		this.jobCode = jobCode;
	}

	public double getLeadLevel() {
		return leadLevel;
	}

	public double getArsenicLevel() {
		return arsenicLevel;
	}

	public double getCadmiumLevel() {
		return cadmiumLevel;
	}

	public double getHemoglobinLevel() {
		return hemoglobinLevel;
	}

	public double getZincpProtoporphyrinLevel() {
		return zincpProtoporphyrinLevel;
	}

	private void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	private void setSampleDate(Date sampleDate) {
		this.sampleDate = sampleDate;
	}

	private void setSampleType(SampleType sampleType) {
		this.sampleType = sampleType;
	}

	private void setLeadLevel(double leadLevel2) {
		this.leadLevel = leadLevel2;
	}

	private void setArsenicLevel(double arsenicLevel) {
		this.arsenicLevel = arsenicLevel;
	}

	private void setCadmiumLevel(double cadmiumLevel) {
		this.cadmiumLevel = cadmiumLevel;
	}

	private void setHemoglobinLevel(double hemoglobinLevel) {
		this.hemoglobinLevel = hemoglobinLevel;
	}

	private void setZincpProtoporphyrinLevel(double zincpProtoporphyrinLevel) {
		this.zincpProtoporphyrinLevel = zincpProtoporphyrinLevel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sample [employeeNumber=");
		builder.append(employeeNumber);
		builder.append(", sampleDate=");
		builder.append(sampleDate);
		builder.append(", sampleType=");
		builder.append(sampleType);
		builder.append(", leadLevel=");
		builder.append(leadLevel);
		builder.append(", arsenicLevel=");
		builder.append(arsenicLevel);
		builder.append(", cadmiumLevel=");
		builder.append(cadmiumLevel);
		builder.append(", hemoglobinLevel=");
		builder.append(hemoglobinLevel);
		builder.append(", zincpProtoporphyrinLevel=");
		builder.append(zincpProtoporphyrinLevel);
		builder.append("]");
		return builder.toString();
	}
}
