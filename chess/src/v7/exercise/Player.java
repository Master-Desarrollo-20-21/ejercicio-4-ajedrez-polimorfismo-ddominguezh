package v7.exercise;

import java.util.ArrayList;
import java.util.List;

import v7.exercise.enums.Color;
import v7.exercise.pieces.Bishop;
import v7.exercise.pieces.King;
import v7.exercise.pieces.Knight;
import v7.exercise.pieces.Pawn;
import v7.exercise.pieces.Queen;
import v7.exercise.pieces.Rook;

public class Player {

	private Color color;
	private List<String> movements;
	private DataPiece[] pieces = new DataPiece[] {
			DataPiece.ROOK,
			DataPiece.KNIGHT,
			DataPiece.BISHOP,
			DataPiece.QUEEN,
			DataPiece.KING,
			DataPiece.BISHOP,
			DataPiece.KNIGHT,
			DataPiece.ROOK
	};
	
	public Player(Color color, Coordinate[] lastRow, Coordinate[] pawnRow) {
		this.color = color;
		this.movements = new ArrayList<String>();
		for( int i = 0 ; i < pawnRow.length ; i++ ) {
			pawnRow[i].add(new Pawn(this));
		}
		try {
			for( int i = 0 ; i < pieces.length ; i++ ) {
				lastRow[i].add(pieces[i].newInstance(this));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean isWhite() {
		return Color.WHITE.equals(this.color);
	}
	
	public String name() {
		return this.color.name();
	}
	
	public void add(String movement) {
		this.movements.add(movement);
	}
	
}
