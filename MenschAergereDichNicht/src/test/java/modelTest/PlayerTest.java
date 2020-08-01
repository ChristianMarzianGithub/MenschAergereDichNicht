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
}