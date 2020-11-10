package v7.exercise.pieces;

import v7.exercise.Coordinate;
import v7.exercise.Player;
import v7.exercise.enums.DataPiece;
import v7.exercise.enums.Position;

public class Rook extends Piece {

	public Rook(Color color) {
		super(color, DataPiece.ROOK);
	}

	@Override
	public boolean canMove(Coordinate origin, Coordinate destination) {
		
		Direction direction = origin.getDirection(destination);
		
		if(direction.isHorizontal() || direction.isVertical()) {
			return true;
		}
		
		return false;
	}
	
}
