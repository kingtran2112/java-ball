package entity;


import java.awt.*;

public class Ball {
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
}
