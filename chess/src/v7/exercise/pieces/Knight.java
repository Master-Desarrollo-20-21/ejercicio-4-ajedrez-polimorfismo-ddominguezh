package v7.exercise.pieces;

import v7.exercise.Coordinate;
import v7.exercise.Player;
import v7.exercise.enums.DataPiece;
import v7.exercise.enums.Position;

public class Knight extends Piece {

	public Knight(Color color) {
		super(color, DataPiece.KNIGHT);
	}

	@Override
	public boolean canMove(Coordinate origin, Coordinate destination) {
		
		Direction direction = origin.getDirection(destination);
		
		if(Direction.L_SHAPE.equals(direction)) {
			return true;
		}
		
		return false;
	}

}
