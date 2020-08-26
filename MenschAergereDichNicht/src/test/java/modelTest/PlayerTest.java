package modelTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import enums.EColor;
import model.Player;

public class PlayerTest {

	@Test
	public void roleDiceTest() {
		
		Player sut = new Player(EColor.Green);
		int diceValue = sut.roleDice();		
		boolean retVal = false;
		if((diceValue > 0)&&(diceValue < 7)) {
			retVal = true;
		}
		assertTrue(retVal);
	}
	
	@Test
	public void initFigureListTestFigureListNotNull() {
		Player sut = new Player(EColor.Black);
		assertTrue(sut.getFigureList() != null);
	}
	@Test
	public void initFigureListTestPositionNotNull() {
		Player sut = new Player(EColor.Black);		
		assertTrue(sut.getFigureList().get(0).getPosistion() != null);
	}	
	@Test
	public void initFigureListTestPositionFieldNrBiggerThanZero() {
		Player sut = new Player(EColor.Black);		
		assertTrue(sut.getFigureList().get(0).getPosistion().getFieldNr() > 0);
	}	
	@Test
	public void initFigureListTestPositionBoardAreaNotNull() {
		Player sut = new Player(EColor.Black);		
		assertTrue(sut.getFigureList().get(0).getPosistion().getBoardArea() != null);
	}
	@Test
	public void initFigureListTestPositionBoardAreaNotEmpty() {
		Player sut = new Player(EColor.Black);		
		assertTrue(sut.getFigureList().get(0).getPosistion().getBoardArea().getSizeOfFields() >= 4);
	}	
	
	@Test
	public void tryToMoveFigureTest() {
		Player sut = new Player(EColor.Black);		
		sut.tryToMoveFigure(sut.getRandomFigure(sut.getFigureList()), sut.roleDice());
		assertTrue(false);
	}
	
}