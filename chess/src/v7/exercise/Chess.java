package v7.exercise;

import v7.exercise.enums.Color;

public class Chess {

	private Board board;
	private Turn turn;
	private Player[] players;
	private Menu menu;
	
	public Chess() {
		this.menu = new MainMenu(this);
	}
	public void init() {
		this.menu.print();
	}
	
	public void play() {
		this.board = new Board();
		this.players = new Player[2];
		this.players[0] = new Player(Color.WHITE, this.board.getRow(0), this.board.getRow(1));
		this.players[1] = new Player(Color.BLACK, this.board.getRow(7), this.board.getRow(6));
		this.turn = new Turn(this.board);
		next();
	}
	
	public Player getPlayer(int index) {
		return this.players[index];
	}
	
	public void next() {
		do {
			this.board.print();
			this.turn.start(this.players);
		}while(this.turn.hasNext());
		finish();
	}

	public void finish() {
		this.board.print();
		init();
	}
	
	public static void main(String[] args) {
		new Chess().init();
	}
	
}
