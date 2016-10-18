import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class booksFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void newBooks() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					booksFrame window = new booksFrame();
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
	public booksFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(107, 0, 212, 272);
		
		
		
		ImageIcon image = new ImageIcon("japanese-fairy-tales-2.gif");
		JLabel lblNewLabel = new JLabel(image);
		panel.setLayout(new FlowLayout());
		panel.add(lblNewLabel);
		
		frame.getContentPane().add(panel);
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 117, 83, 42);
		
		AbstractAction lbp = new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				panel.add(lblNewLabel);
			}
		};
		JButton btnNewButton = new JButton("<");
		btnNewButton.addActionListener(lbp);
		btnNewButton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), "onLEFT");
		btnNewButton.getActionMap().put("onLEFT", lbp);
		panel_1.setLayout(new FlowLayout());
		panel_1.add(btnNewButton);
		
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(331, 117, 89, 42);
		
		AbstractAction rbp = new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				//different book to choose
			}
		};
		JButton button = new JButton(">");
		button.addActionListener(rbp);
		button.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0), "onRIGHT");
		button.getActionMap().put("onRIGHT", rbp);
		panel_2.setLayout(new FlowLayout());
		panel_2.add(button);
		
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(146, 274, 128, 37);
		
		AbstractAction mbp = new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				chapterSelection n = new chapterSelection();
				n.newChapter();
			}
		};
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(mbp);
		btnConfirm.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "onENTER");
		btnConfirm.getActionMap().put("onENTER", mbp);
		panel_3.setLayout(new FlowLayout());
		panel_3.add(btnConfirm);
		frame.getContentPane().add(panel_3);
		//ImageIcon image = new ImageIcon("japanese-fairy-tales-2.gif");
		//frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("bright-colored-backgrounds-1455249.jpg")))));
		
	}
}
