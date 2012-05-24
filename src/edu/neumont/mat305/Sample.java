package edu.neumont.mat305;

import java.util.Date;

public class Sample {

	private int employeeNumber;
	private Date sampleDate;
	private SampleType sampleType;
	private int jobCode;
	private int leadLevel;
	private int arsenicLevel;
	private int cadmiumLevel;
	private int hemoglobinLevel;
	private int zincpProtoporphyrinLevel;

	Sample(int employeeNumber, Date sampleDate, SampleType sampleType, int jobCode,
			int leadLevel, int arsenicLevel, int cadmiumLevel,
			int hemoglobinLevel, int zincpProtoporphyrinLevel) {
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

	public int getLeadLevel() {
		return leadLevel;
	}

	public int getArsenicLevel() {
		return arsenicLevel;
	}

	public int getCadmiumLevel() {
		return cadmiumLevel;
	}

	public int getHemoglobinLevel() {
		return hemoglobinLevel;
	}

	public int getZincpProtoporphyrinLevel() {
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

	private void setLeadLevel(int leadLevel) {
		this.leadLevel = leadLevel;
	}

	private void setArsenicLevel(int arsenicLevel) {
		this.arsenicLevel = arsenicLevel;
	}

	private void setCadmiumLevel(int cadmiumLevel) {
		this.cadmiumLevel = cadmiumLevel;
	}

	private void setHemoglobinLevel(int hemoglobinLevel) {
		this.hemoglobinLevel = hemoglobinLevel;
	}

	private void setZincpProtoporphyrinLevel(int zincpProtoporphyrinLevel) {
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
