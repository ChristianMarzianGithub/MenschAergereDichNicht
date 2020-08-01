package model;

import enums.EBoardArea;

public class Position {

	private EBoardArea area;
	private int fieldNr;
	
	
	
	
	public EBoardArea getArea() {
		return area;
	}

	public void setArea(EBoardArea area) {
		this.area = area;
	}

	public int getFieldNr() {
		return fieldNr;
	}

	public void setFieldNr(int fieldNr) {
		this.fieldNr = fieldNr;
	}
	
}