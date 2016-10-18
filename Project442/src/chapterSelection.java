import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class chapterSelection {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void  newChapter() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chapterSelection window = new chapterSelection();
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
	public chapterSelection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblChapter = new JLabel("CHAPTER SELECTION:");
		lblChapter.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblChapter.setBounds(110, 35, 188, 37);
		frame.getContentPane().add(lblChapter);
		
		JButton btnNewButton = new JButton("ONE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				newFrame n = new newFrame();
				n.newWindow();
			}
		});
		btnNewButton.setBounds(151, 81, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("TWO");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				newFrame n = new newFrame();
				n.newWindow();
			}
		});
		btnNewButton_1.setBounds(151, 126, 97, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("THREE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				newFrame n = new newFrame();
				n.newWindow();
			}
		});
		btnNewButton_2.setBounds(151, 170, 97, 25);
		frame.getContentPane().add(btnNewButton_2);
	}
}
