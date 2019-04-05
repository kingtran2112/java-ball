package entity;


import java.awt.*;

public class Ball implements Drawable {
	private static final int DEFAULT_SIZE = 50;
	private Coordinates coordinates;
	private int size;

	public Ball(Coordinates coordinates, int size) {
		this.coordinates = coordinates;
		this.size = size;
	}

	public Ball(Coordinates coordinates) {
		this(coordinates, DEFAULT_SIZE);
	}

	public void draw(Graphics g) {
		g.drawOval(coordinates.getX(),coordinates.getY(),size, size);
	}

	/**
	 * move the ball horizontal x and vertical y
	 * @param x will be +x with the current point
	 * @param y will be +y with the current point
	 */
	public void changeDirection(int x, int y) {
		this.coordinates.setX(this.coordinates.getX() + x);
		this.coordinates.setY(this.coordinates.getY() + y);
	}
}
