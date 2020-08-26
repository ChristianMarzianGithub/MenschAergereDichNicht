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
		if(BoardAreaType.equalsIgnoreCase("START")) {
			return new StartArea(EBoardAreaSize.StartAreaSize);
		}
		if(BoardAreaType.equalsIgnoreCase("FIELD")) {
			return new FieldArea(EBoardAreaSize.FieldAreaSize);
		}
				
		return null;
	}
}