package model.BordArea;

import enums.EBoardAreaSize;

public class BoardAreaFactory {

	public BoardArea getBoardArea(String BoardAreaType) {
		if(BoardAreaType == null) {
			return null;
		}
		
		if(BoardAreaType.equalsIgnoreCase("FINISH")) {
			return new FinishArea(EBoardAreaSize.FinishAreaSize);
		}
		if(BoardAreaType.equalsIgnoreCase("WAITING")) {
			return new WaitingArea(EBoardAreaSize.WaitingAreaSize);
		}
		if(BoardAreaType.equalsIgnoreCase("FIELD")) {
			return new FieldArea(EBoardAreaSize.FIeldAreaSize);
		}
				
		return null;
	}
}