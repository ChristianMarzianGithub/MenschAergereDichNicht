package model.BordArea;

public abstract class BoardArea {
	
	private int sizeOfFields;
	
	public BoardArea(int sizeOfFields) {
		this.setSizeOfFields(sizeOfFields);
	}

	public int getSizeOfFields() {
		return this.sizeOfFields;
	}
	void setSizeOfFields(int sizeOfFields) {
		this.sizeOfFields = sizeOfFields;
	}
}
