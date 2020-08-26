package main;

import enums.EColor;
import model.Board;
import model.Figure;
import model.Player;

public class main {
	
	public static void main(String [] args) {
		Board SpielBrett = new Board();
		
		SpielBrett.addPlayer(EColor.Black);
		SpielBrett.addPlayer(EColor.Yellow);
		SpielBrett.addPlayer(EColor.Red);
		SpielBrett.addPlayer(EColor.Green);
		
		while(true) {			
			for(Player p: SpielBrett.getListOfPlayer()) {
				
				Figure f = p.getRandomFigure(p.getFigureList());
				
				p.moveFigure(f,p.roleDice());
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}		
	}
}