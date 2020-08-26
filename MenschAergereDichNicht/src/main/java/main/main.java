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
		
		
		/* 
		 * one SpielBrett has 4 Players
		 * Every Player has 4 Figures 
		 */
		
		while(true) {			
			for(Player p: SpielBrett.getListOfPlayer()) {
				
				Figure f = p.getRandomFigure(p.getFigureList());
				
				p.tryToMoveFigure(f,p.roleDice());
				
				
				System.out.println("Color: " + p.getColor());
				
				showPositionOfEveryFigureByPlayer(p);
				
				
				
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}		
	}

	private static void showPositionOfEveryFigureByPlayer(Player p) {
		int i = 1;
		for(Figure f: p.getFigureList()) {
			System.out.println("Player with color: " + p.getColor()  + " and Figure No. " + i + " at Position "+  f.getPosistion().getFieldNr()
								+ " in " + f.getPosistion().getBoardArea().getClass().getSimpleName()
					
					);
			i++;
		}
	}
}