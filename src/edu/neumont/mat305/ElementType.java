package edu.neumont.mat305;

public enum ElementType {
	Lead(1),Arsenic(4),Cadmium(2),Hemoglobin(6),ZincProtoporphyrin(30);
	
	public int value;
	
	private ElementType(int i) {
		value=i;
	}
	
	public int getValue(){
		return value;
	}
}
