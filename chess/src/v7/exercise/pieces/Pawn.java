package v7.exercise.pieces;

import v7.exercise.Coordinate;
import v7.exercise.Player;
import v7.exercise.enums.DataPiece;
import v7.exercise.enums.Position;

public class Pawn extends Piece{

	//PEON
	public Pawn(Player player) {
		super(player, DataPiece.PAWN);
	}

	@Override
	public boolean canMove(Coordinate origin, Coordinate destination) {
		Direction direction = origin.getDirection(destination);
		int distance = origin.distance(destination);
		if(destination.containsPieceOfOpponent(this.player)) {
			return distance == 1 && ((this.player.isWhite() && direction.isDiagonalForward()) 
					|| (!this.player.isWhite() && direction.isDiagonalBack()));
		}
		if(distance == 1 || (distance == 2 && this.initialPosition)) {
			return ((this.player.isWhite() && Direction.VERTICAL_FORWARD.equals(direction)) || 
					(!this.player.isWhite() && Direction.VERTICAL_BACK.equals(direction)));
		}
		return false;
	}
	
}
