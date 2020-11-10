package v7.exercise.pieces;

import v7.exercise.Coordinate;
import v7.exercise.Player;
import v7.exercise.enums.DataPiece;
import v7.exercise.enums.Position;

public class Queen extends Piece {

	public Queen(Color color) {
		super(color, DataPiece.QUEEN);
	}

	@Override
	public boolean canMove(Coordinate origin, Coordinate destination) {
		Direction direction = origin.getDirection(destination);
		if(!Direction.L_SHAPE.equals(direction)) {
			return true;
		}
		return false;
	}
	
}
