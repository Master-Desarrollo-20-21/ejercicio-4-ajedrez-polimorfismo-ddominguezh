package v7.exercise.pieces;

import v7.exercise.Coordinate;
import v7.exercise.Player;
import v7.exercise.enums.DataPiece;
import v7.exercise.enums.Position;

public class Rook extends Piece {

	//TORRE
	public Rook(Player player) {
		super(player, DataPiece.ROOK);
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
