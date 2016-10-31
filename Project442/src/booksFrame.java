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
	//private JLabel lblNewLabel;
	private int c=0;
	//private JPanel panel;
	private ImageIcon image=new ImageIcon("japanese-fairy-tales-2.gif");
	private ImageIcon nImage=new ImageIcon("22917.jpg");
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
		panel.setBounds(10, 0, 212, 272);
		
		JLabel lblNewLabel = new JLabel(image);
		panel.setLayout(new FlowLayout());
		panel.add(lblNewLabel);
		frame.getContentPane().add(panel);
		AbstractAction lbp = new AbstractAction(){
			public void actionPerformed(ActionEvent e) {		
				
			}
		};
		
		AbstractAction rbp = new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				
				//different book to choose
				
			}
		};
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(53, 272, 128, 37);
		
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
		//spanel_3.setLayout(new FlowLayout());
		panel_3.add(btnConfirm);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(232, 0, 192, 272);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel(nImage);
		panel_1.add(lblNewLabel_1);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(270, 272, 128, 37);
		frame.getContentPane().add(panel_2);
		
		JButton btnConfirm_1 = new JButton("Confirm");
		panel_2.add(btnConfirm_1);
		//ImageIcon image = new ImageIcon("japanese-fairy-tales-2.gif");
		//frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("bright-colored-backgrounds-1455249.jpg")))));
		//ImageIcon image=new ImageIcon();
		
		
	}
}
