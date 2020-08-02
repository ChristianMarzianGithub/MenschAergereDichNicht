package model;

public class Figure {
		
	private Position posistion;
	
	public Figure(Position p) {
		this.setPosistion(p);
	}

	public Position getPosistion() {
		return posistion;
	}

	public void setPosistion(Position posistion) {
		this.posistion = posistion;
	}
	
	
	
}