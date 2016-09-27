import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class settingFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void newWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					settingFrame window = new settingFrame();
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
	public settingFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		AbstractAction ebp = new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		};
		JButton btnEasy = new JButton("EASY (E)");
		btnEasy.addActionListener(ebp);
		btnEasy.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_E, 0), "onE");
		btnEasy.getActionMap().put("onE", ebp);
		btnEasy.setBounds(167, 84, 105, 25);
		btnEasy.setForeground(Color.WHITE);
		btnEasy.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(btnEasy);
		
		AbstractAction mbp = new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		};
		JButton btnMedium = new JButton("MEDIUM (M)");
		btnMedium.addActionListener(mbp);
		btnMedium.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_M, 0), "onM");
		btnMedium.getActionMap().put("onM", mbp);
		btnMedium.setForeground(Color.WHITE);
		btnMedium.setBackground(Color.DARK_GRAY);
		btnMedium.setBounds(167, 122, 105, 25);
		frame.getContentPane().add(btnMedium);
		
		AbstractAction hbp = new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		};
		JButton btnHard = new JButton("HARD (H)");
		btnHard.addActionListener(mbp);
		btnHard.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_H, 0), "onH");
		btnHard.getActionMap().put("onH", hbp);
		btnHard.setForeground(Color.WHITE);
		btnHard.setBackground(Color.DARK_GRAY);
		btnHard.setBounds(167, 160, 105, 25);
		frame.getContentPane().add(btnHard);
		
		AbstractAction ibp = new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		};
		JButton btnInsane = new JButton("INSANE (I)");
		btnInsane.addActionListener(ibp);
		btnInsane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_I, 0), "onI");
		btnInsane.getActionMap().put("onI", ibp);
		btnInsane.setForeground(Color.WHITE);
		btnInsane.setBackground(Color.DARK_GRAY);
		btnInsane.setBounds(167, 198, 105, 25);
		frame.getContentPane().add(btnInsane);
		
		JLabel lblTypingBiubiubiu = new JLabel("SELECT DIFFICULTY:");
		lblTypingBiubiubiu.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
		lblTypingBiubiubiu.setBounds(110, 30, 224, 44);
		frame.getContentPane().add(lblTypingBiubiubiu);
		
		AbstractAction bbp = new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		};
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(bbp);
		btnBack.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_B, 0), "onB");
		btnBack.getActionMap().put("onB", bbp);
		btnBack.setBounds(323, 215, 97, 25);
		frame.getContentPane().add(btnBack);
	}
}
