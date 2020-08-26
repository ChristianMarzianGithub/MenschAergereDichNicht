package model;

import java.util.ArrayList;

import enums.EColor;
import model.BordArea.BoardAreaFactory;

public class Player {
	private ArrayList<Figure> FigureList;
	private int color;
	private final int maxNumberOfFigures = 4; 
	
	
	public Player(int color) {
		this.setColor(color);
		FigureList = new ArrayList<Figure>();
		this.setFigureList(FigureList);
		this.initFigureList(this.getFigureList());		
	}
		
	private void initFigureList(ArrayList<Figure> figureList) {
		for(int i = 1;i <=  maxNumberOfFigures; i++) {
			figureList.add	(
								new Figure	(
												new Position(
																i, 
																new BoardAreaFactory().getBoardArea("START")
															)
											)
							);
		}
	}

	private void addFiguresAndPlacethemInStart(ArrayList<Figure> figureList) {
		for(int i=0; i<4; i++) {
			figureList.add(
							new Figure(
										new Position(
														i,
														new BoardAreaFactory().getBoardArea("START")
													)
										)
							);
		}
	}

	public int roleDice() {
		return (int)(Math.random() * 6)+1;//we have to add 1 because otherwise it would get eventually to 0
	}
	
	public void tryToMoveFigure(Figure choosenFigure, int amountOfStepsForward) {
		Position p = choosenFigure.getPosistion();
		System.out.println(amountOfStepsForward);
		
		if( p.getBoardArea().getClass().getSimpleName().equalsIgnoreCase("StartArea")  && amountOfStepsForward == 6){
			System.out.println("rausrücken");
			choosenFigure.goInField();
		}
		
		if( p.getBoardArea().getClass().getSimpleName().equalsIgnoreCase("FIeldArea")){
			System.out.println("Move on Field");
		}
		
		if( p.getBoardArea().getClass().getSimpleName().equalsIgnoreCase("FIeldArea")){
			System.out.println("Move in Finish");
		}
		
	}
	
	public Figure getRandomFigure(ArrayList<Figure> figureList){
		return figureList.get((int) (Math.random() * 4));
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
		this.FigureList = figureList;
	}
}