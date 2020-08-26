package model;

import model.BordArea.BoardArea;

public class Position {

	private int fieldNr;
	private BoardArea boardArea;

	public Position(int fieldNr, BoardArea boardArea) {
		this.setFieldNr(fieldNr);
		this.setBoardArea(boardArea);
	}
	
	public int getFieldNr() {
		return fieldNr;
	}

	public void setFieldNr(int fieldNr) {
		this.fieldNr = fieldNr;
	}

	public BoardArea getBoardArea() {
		return boardArea;
	}

	public void setBoardArea(BoardArea boardArea) {
		this.boardArea = boardArea;
	}
	
}