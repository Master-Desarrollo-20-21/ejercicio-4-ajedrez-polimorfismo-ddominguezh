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
	
	public Player(Color color, Board board) {
		this.color = color;
		this.movements = new ArrayList<String>();
		try {
			for( int i = 0 ; i < board.getRow(color.getFirstRow()).length ; i++ ) {
				board.getRow(color.getFirstRow())[i].add(pieces[i].newInstance(this));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		for( int i = 0 ; i < board.getRow(color.getSecondRow()).length ; i++ ) {
			board.getRow(color.getSecondRow())[i].add(new Pawn(this));
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
