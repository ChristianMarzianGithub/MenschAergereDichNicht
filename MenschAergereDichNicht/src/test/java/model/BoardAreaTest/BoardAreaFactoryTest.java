package model.BoardAreaTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import model.BordArea.BoardArea;
import model.BordArea.BoardAreaFactory;

public class BoardAreaFactoryTest {
	@Test
	public void BoardFactoryFinishAreaTest() {
		
		BoardAreaFactory boardAreaFactory = new BoardAreaFactory();
		BoardArea finishArea = boardAreaFactory.getBoardArea("FINISH");
		
		assertTrue(finishArea.getSizeOfFields() == 4);		
	}
	
	@Test
	public void BoardFactoryWaitingAreaTest() {
		
		BoardAreaFactory boardAreaFactory = new BoardAreaFactory();
		BoardArea waitingArea = boardAreaFactory.getBoardArea("WAITING");
		
		assertTrue(waitingArea.getSizeOfFields() == 4);		
	}
	
	@Test
	public void BoardFactoryFeeldAreaTest() {
		
		BoardAreaFactory boardAreaFactory = new BoardAreaFactory();
		BoardArea startArea = boardAreaFactory.getBoardArea("FIELD");
		
		assertTrue(startArea.getSizeOfFields() == 40);		
	}
	
}
