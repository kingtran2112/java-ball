package frame;

import entity.Ball;
import entity.Coordinates;
import entity.Drawable;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GUI {
	public static void createAndShowGUI() {
		//Create Frame
		JFrame jFrame = new JFrame("Ball");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jFrame.setSize(screenSize);

		Ball ball1 = new Ball(new Coordinates(50,50));
		// Another thread
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit((Runnable) () -> {
			while(true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				ball1.changeDirection(1, 1);
			}
		});

		//Component
		List<Drawable> drawable = new ArrayList<>();
		drawable.add(ball1);

		jFrame.add(new DrawPanel(drawable));

		//Show
		jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		jFrame.pack();
		jFrame.setVisible(true);
	}
}
