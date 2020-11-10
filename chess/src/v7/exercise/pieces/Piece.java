package v7.exercise.pieces;

import v7.exercise.Coordinate;
import v7.exercise.Player;
import v7.exercise.enums.DataPiece;

public abstract class Piece {

	protected Color color;
	protected boolean initialPosition;
	private DataPiece data;
	
	public Piece(Color color, DataPiece data) {
		this.color = color;
		this.data = data;
		this.initialPosition = true;
	}
	
	public char name() {
		return data.getName(this.color);
	}
	
	public boolean equalsColor(Color color) {
		return this.color.equals(color);
	}
	
	public void move() {
		this.initialPosition = false;
	}

	public boolean equals(DataPiece piece) {
		return this.data.equals(piece);
	}
	
	public abstract boolean canMove(Coordinate origin, Coordinate destination);

}
