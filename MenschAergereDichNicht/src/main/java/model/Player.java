package model;

import java.util.ArrayList;

import enums.EColor;

public class Player {
	private ArrayList<Figure> FigureList;
	private int color;
	
	public Player(int c) {
		this.setColor(c);
		FigureList = new ArrayList<Figure>();
		this.setFigureList(FigureList);
	}
		
	public int roleDice() {
		return (int)(Math.random() * 6)+1;
	}
	
	public int getColor() {
		return color;
	}

	private void setColor(int color) {
		this.color = color;		
	}

	public ArrayList<Figure> getFigureList() {
		return FigureList;
	}

	public void setFigureList(ArrayList<Figure> figureList) {
		FigureList = figureList;
	}
}