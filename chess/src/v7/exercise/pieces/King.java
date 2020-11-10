package v7.exercise.pieces;

import v7.exercise.Coordinate;
import v7.exercise.Player;
import v7.exercise.enums.DataPiece;

public class King extends Piece {

	public King(Color color) {
		super(color, DataPiece.KING);
	}

	@Override
	public boolean canMove(Coordinate origin, Coordinate destination) {
		int distance = origin.distance(destination);
		
		if(distance == 1) {
			return true;
		}
		
		return false;
	}
	
}
