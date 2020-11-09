package v7.exercise.pieces;

import v7.exercise.Coordinate;
import v7.exercise.Player;
import v7.exercise.enums.DataPiece;
import v7.exercise.enums.Position;

public class Bishop extends Piece {

	//ALFIL
	public Bishop(Player player) {
		super(player, DataPiece.BISHOP);
	}

	@Override
	public boolean canMove(Coordinate origin, Coordinate destination) {
		
		Direction direction = origin.getDirection(destination);
		
		if(direction.isDiagonal()) {
			return true;
		}
		
		return false;
	}
	
}
