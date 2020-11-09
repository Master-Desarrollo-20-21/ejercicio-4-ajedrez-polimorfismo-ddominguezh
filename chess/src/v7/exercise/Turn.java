package v7.exercise;

public class Turn {

	private Player player;
	private PlayMenu menu;
	private int count;
	private boolean hasNext;
	public Turn(Board board) {
		this.menu = new PlayMenu(this, board);
		this.count = 0;
		this.hasNext = true;
	}

	public void start(Player[] players) {
		this.player = players[this.count%2];
		Console.getInstance().write("Turn " + this.player.name());
		this.menu.print();
	}
	
	public void giveUp() {
		Console.getInstance().write(this.player.name() + " Loose");
		this.hasNext = false;
	}

	public void change(Player player) {
		this.player = player;
	}

	public Player getPlayer() {
		return this.player;
	}

	public void next(String movement) {
		this.player.add(movement);
		this.count++;
	}
	
	public void finish(String movement) {
		this.player.add(movement);
		Console.getInstance().write(this.player.name() + " Win");
		this.hasNext = false;
	}
	
	public boolean hasNext() {
		return this.hasNext;
	}

}
