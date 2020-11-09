package v7.exercise.enums;

public enum Direction {
	VERTICAL_FORWARD,
	VERTICAL_BACK,
	HORIZONTAL_RIGHT,
	HORIZONTAL_LEFT,
	DIAGONAL_FORWARD_LEFT,
	DIAGONAL_FORWARD_RIGHT,
	DIAGONAL_BACK_LEFT,
	DIAGONAL_BACK_RIGHT,
	L_SHAPE;

	public static Direction valueOf(int compareX, int compareY) {
		if(compareY == 0 && compareX < 0) {
			return Direction.VERTICAL_FORWARD;
		}
		if(compareY == 0 && compareX > 0) {
			return Direction.VERTICAL_BACK;
		}
		if(compareX == 0 && compareY < 0) {
			return Direction.HORIZONTAL_RIGHT;
		}
		if(compareX == 0 && compareY > 0) {
			return Direction.HORIZONTAL_LEFT;
		}
		if(Math.abs(compareX) == Math.abs(compareY) && compareX < 0 && compareY < 0) {
			return Direction.DIAGONAL_FORWARD_LEFT;
		}
		if(Math.abs(compareX) == Math.abs(compareY) && compareX < 0 && compareY > 0) {
			return Direction.DIAGONAL_FORWARD_RIGHT;
		}
		if(Math.abs(compareX) == Math.abs(compareY) && compareX > 0 && compareY < 0) {
			return Direction.DIAGONAL_BACK_LEFT;
		}
		if(Math.abs(compareX) == Math.abs(compareY) && compareX > 0 && compareY > 0) {
			return Direction.DIAGONAL_BACK_RIGHT;
		}
		if(Math.abs(compareX) + Math.abs(compareY) == 3) {
			return Direction.L_SHAPE;
		}
		return null;
	}

	public boolean isVertical() {
		return Direction.VERTICAL_FORWARD.equals(this) || Direction.VERTICAL_BACK.equals(this);
	}

	public boolean isHorizontal() {
		return Direction.HORIZONTAL_LEFT.equals(this) || Direction.HORIZONTAL_RIGHT.equals(this);
	}
	
	public boolean isDiagonal() {
		return isDiagonalForward() ||isDiagonalBack();
	}

	public boolean isDiagonalForward() {
		return Direction.DIAGONAL_FORWARD_LEFT.equals(this) || Direction.DIAGONAL_FORWARD_RIGHT.equals(this);
	}
	
	public boolean isDiagonalBack() {
		return Direction.DIAGONAL_BACK_LEFT.equals(this) || Direction.DIAGONAL_BACK_RIGHT.equals(this);
	}
	
	public boolean isMinor() {
		return Direction.VERTICAL_FORWARD.equals(this) || Direction.HORIZONTAL_RIGHT.equals(this) || Direction.DIAGONAL_FORWARD_LEFT.equals(this) || Direction.DIAGONAL_FORWARD_RIGHT.equals(this);
	}
	
}
