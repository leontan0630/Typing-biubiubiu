package typebiu;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyJFrame extends JFrame {
	private Canvas canvas;
	private Drawing drawing;
	public MyJFrame() {
		setTitle("HeroDemo");
		this.setSize(753, 500);
		this.setLocation(300, 300);
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent e) {
				drawing = new Drawing();
				drawing.start();
			}
		});
		canvas = new Canvas();
		canvas.setBackground(Color.WHITE);
		getContentPane().add(canvas, BorderLayout.CENTER);

	}

	public class Drawing extends Thread {
		private boolean flag = true;
		public void setFlag(boolean flag) {
			this.flag = flag;
		}

		public void run() {
			while (flag) {
				canvas.updateCanvas();
				try {
					sleep(50);
				} catch (InterruptedException e) {
				}
			}
		}

	}

}
