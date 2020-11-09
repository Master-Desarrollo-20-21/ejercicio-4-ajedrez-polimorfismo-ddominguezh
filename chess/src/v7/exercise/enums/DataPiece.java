package v7.exercise.enums;

public enum DataPiece {
	PAWN("Pawn",'\u2659', '\u265F'),
	ROOK("Rook",'\u2656', '\u265C'),
	KNIGHT("Knight",'\u2658', '\u265E'),
	BISHOP("Bishop",'\u2657', '\u265D'),
	QUEEN("Queen",'\u2655', '\u265B'),
	KING("King",'\u2654', '\u265A');
	private String classname;
	private char white;
	private char black;
	
	DataPiece(String classname, char white, char black){
		this.classname = "v7.exercise.pieces." + classname;
		this.white = white;
		this.black = black;
	}
	
	@SuppressWarnings("static-access")
	public Piece newInstance(Player player) throws Exception {
		return (Piece) Piece.class.forName(this.classname).getDeclaredConstructor(player.getClass()).newInstance(player);
	}
	
	public char getName(boolean isWhite) {
		if(isWhite) {
			return this.white;
		}
		return this.black;
	}
}
