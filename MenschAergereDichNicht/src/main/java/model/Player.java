package model;

import java.util.ArrayList;

import enums.EColor;

public class Player {
	private ArrayList<Figure> FigureList;
	private EColor color;
	
	public Player(EColor c) {
		this.setColor(c);
		FigureList = new ArrayList<Figure>();
		this.setFigureList(FigureList);
	}
	
	public EColor getColor() {
		return color;
	}

	private void setColor(EColor color) {
		this.color = color;		
	}

	public ArrayList<Figure> getFigureList() {
		return FigureList;
	}

	public void setFigureList(ArrayList<Figure> figureList) {
		FigureList = figureList;
	}
}