package model;

import java.util.ArrayList;

public class Board {
	
	private ArrayList<Player> listOfPlayer;
	
	public Board() {			
	}
	
	public void addPlayer(int color) {
		this.listOfPlayer.add(new Player(color));
	}
	
	public int moveFigure(Position newPos) {
		return 0;
	}

	public ArrayList<Player> getListOfPlayer() {
		return listOfPlayer;
	}

	public void setListOfPlayer(ArrayList<Player> listOfPlayer) {
		this.listOfPlayer = listOfPlayer;
	}
}