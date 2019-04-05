package entity;

/**
 * This class is represent the coordinates of the ball.
 * Through it, we also know the direction of the ball by the change of x and y
 */
public class Coordinates {
	private int x;
	private int y;

	public Coordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	void setX(int x) {
		this.x = x;
	}

	void setY(int y) {
		this.y = y;
	}
}
