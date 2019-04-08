package frame;

import entity.Drawable;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class DrawPanel extends JPanel {
	private List<Drawable> drawables;

	public DrawPanel(List<Drawable> drawables) {
		this.drawables = drawables;
	}

	public void paint(Graphics g) {
		super.paintComponent(g);
		drawables.forEach(drawable -> drawable.draw(g));
		repaint();
	}
}
