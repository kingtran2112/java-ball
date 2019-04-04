package frame;

import javax.swing.*;
import java.awt.*;

public class GUI {
	public static void createAndShowGUI() {
		//Create Frame
		JFrame jFrame = new JFrame("Ball");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		jFrame.setSize(screenSize);

		//Component
		JComponent desktopPane = new JDesktopPane();
		desktopPane.setSize(screenSize);

		jFrame.add(desktopPane);

		//Show
		jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		jFrame.pack();
		jFrame.setVisible(true);
	}
}
