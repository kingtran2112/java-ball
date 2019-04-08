package frame;

import entity.Ball;
import entity.Drawable;
import utils.BallCreator;
import utils.BallExecutor;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GUI {
	public static void createAndShowGUI() {
		BallCreator ballCreator = new BallCreator();
		//Create Frame
		JFrame jFrame = new JFrame("Ball");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jFrame.setSize(screenSize);

		List<Ball> balls = ballCreator.create(2, screenSize);
		new BallExecutor(balls).execute();

		//Component
		List<Drawable> drawable = new ArrayList<>(balls);
		jFrame.add(new DrawPanel(drawable));

		//Show
		jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		jFrame.pack();
		jFrame.setVisible(true);
	}
}
