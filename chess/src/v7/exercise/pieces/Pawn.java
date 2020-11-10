package v7.exercise.pieces;

import v7.exercise.Coordinate;
import v7.exercise.Player;
import v7.exercise.enums.DataPiece;
import v7.exercise.enums.Position;

public class Pawn extends Piece{

	public Pawn(Color color) {
		super(color, DataPiece.PAWN);
	}

	@Override
	public boolean canMove(Coordinate origin, Coordinate destination) {
		Direction direction = origin.getDirection(destination);
		int distance = origin.distance(destination);
		if(destination.containsPieceOfOpponent(this.color)) {
			return distance == 1 && ((Color.WHITE.equals(this.color) && direction.isDiagonalForward()) 
					|| (Color.BLACK.equals(this.color) && direction.isDiagonalBack()));
		}
		if(distance == 1 || (distance == 2 && this.initialPosition)) {
			return ((Color.WHITE.equals(this.color) && Direction.VERTICAL_FORWARD.equals(direction)) || 
					(Color.BLACK.equals(this.color) && Direction.VERTICAL_BACK.equals(direction)));
		}
		return false;
	}
	
}
