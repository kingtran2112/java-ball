package entity;


import frame.GUI;

import java.awt.*;

public class Ball implements Drawable {
	private static final int DEFAULT_SIZE = 50;
	private static final int DEFAULT_VX = 0;
	private static final int DEFAULT_VY = 20;
	private Coordinates coordinates;
	private int size;
	private int vx;
	private int vy;
	private GUI frame;

	public Ball(Coordinates coordinates, GUI frame, int size, int vx, int vy) {
		this.coordinates = coordinates;
		this.size = size;
		this.vx = vx;
		this.vy = vy;
		this.frame = frame;
	}

	public Ball(Coordinates coordinates, GUI frame) {
		this(coordinates, frame, DEFAULT_SIZE, DEFAULT_VX, DEFAULT_VY);
	}

	public void draw(Graphics g) {
		g.drawOval(coordinates.getX(),coordinates.getY(),size, size);
	}

	/**
	 * move the ball horizontal vx and vertical vy
	 */
	public void move() {
		if (this.coordinates.getX() + size >= frame.getWidth() || this.coordinates.getX() <= 0) {
			vx*=-1;
		}
		if (this.coordinates.getY() + 2*size >= frame.getHeight() || this.coordinates.getY() <= 0) {
			vy*=-1;
		}
		this.coordinates.setX(this.coordinates.getX() + vx);
		this.coordinates.setY(this.coordinates.getY() + vy);
	}
}
