import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Frame {

	private JFrame frame;
	private JTextField txtTypingBiubiubiu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnStart = new JButton("START");
		btnStart.setForeground(Color.BLACK);
		frame.getContentPane().add(btnStart, BorderLayout.SOUTH);
		
		txtTypingBiubiubiu = new JTextField();
		txtTypingBiubiubiu.setForeground(Color.WHITE);
		txtTypingBiubiubiu.setBackground(Color.BLACK);
		txtTypingBiubiubiu.setHorizontalAlignment(SwingConstants.CENTER);
		txtTypingBiubiubiu.setText("Typing BIUBIUBIU");
		frame.getContentPane().add(txtTypingBiubiubiu, BorderLayout.NORTH);
		txtTypingBiubiubiu.setColumns(10);
	}

}
