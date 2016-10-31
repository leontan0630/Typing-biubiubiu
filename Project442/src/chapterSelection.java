import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
		lblChapter.setBounds(118, 11, 188, 37);
		frame.getContentPane().add(lblChapter);
		JButton btnNewButton = new JButton("THE ADVENTURES OF KINTARO, THE GOLDEN BOY");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PrintWriter writer = new PrintWriter("the-chapter.txt","UTF-8");
					writer.println("THE ADVENTURES OF KINTARO, THE GOLDEN BOY");
					writer.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				frame.dispose();
				newFrame n = new newFrame();
				n.newWindow();
			}
		});
		btnNewButton.setBounds(51, 84, 308, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("THE BAMBOO-CUTTER AND THE MOON-CHILD");
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PrintWriter writer = new PrintWriter("the-chapter.txt","UTF-8");
					writer.println("THE BAMBOO-CUTTER AND THE MOON-CHILD");
					writer.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				frame.dispose();
				newFrame n = new newFrame();
				n.newWindow();
			}
		});
		btnNewButton_1.setBounds(51, 145, 308, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("THE STORY OF URASHIMA TARO, THE FISHER LAD");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PrintWriter writer = new PrintWriter("the-chapter.txt","UTF-8");
					writer.println("THE STORY OF URASHIMA TARO, THE FISHER LAD");
					writer.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				frame.dispose();
				newFrame n = new newFrame();
				n.newWindow();
			}
		});
		btnNewButton_2.setBounds(51, 206, 308, 25);
		frame.getContentPane().add(btnNewButton_2);
		
	}
}