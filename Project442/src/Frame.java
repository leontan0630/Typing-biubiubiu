import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
//import newFrame.java;
public class Frame extends newFrame {

	private static JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					window.frame.setVisible(true);
					frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
					frame.setResizable(false);
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
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		AbstractAction sbp = new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				newFrame n =  new newFrame();
				n.newWindow();
				
			}
		};
		JButton btnStart = new JButton("START (S)");
		btnStart.addActionListener(sbp);
		btnStart.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_S, 0), "onS");
		btnStart.getActionMap().put("onS", sbp);
		btnStart.setForeground(Color.WHITE);
		btnStart.setBackground(Color.DARK_GRAY);
		btnStart.setBounds(262, 84, 126, 25);
		frame.getContentPane().add(btnStart);
		
		AbstractAction qbp = new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		JButton btnQuite = new JButton("QUIT (Q)");
		btnQuite.addActionListener(qbp);
		btnQuite.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_Q, 0), "onQ");
		btnQuite.getActionMap().put("onQ", qbp);
		btnQuite.setForeground(Color.WHITE);
		btnQuite.setBackground(Color.DARK_GRAY);
		btnQuite.setBounds(262, 199, 126, 25);
		frame.getContentPane().add(btnQuite);
		
		AbstractAction dbp = new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				settingFrame n =  new settingFrame();
				n.newWindow();
			}
		};
		JButton btnSetting = new JButton("DIFFICULTY (D)");
		btnSetting.addActionListener(dbp);
		btnQuite.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_D, 0), "onD");
		btnQuite.getActionMap().put("onD", dbp);
		btnSetting.setForeground(Color.WHITE);
		btnSetting.setBackground(Color.DARK_GRAY);
		btnSetting.setBounds(262, 122, 126, 25);
		frame.getContentPane().add(btnSetting);
		
		JLabel lblSomeTips = new JLabel();
		lblSomeTips.setBounds(39, 83, 162, 128);
		frame.getContentPane().add(lblSomeTips);
		
		AbstractAction gbp = new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				lblSomeTips.setText("Some tips !!!");
			}
		};
		JButton btnGuid = new JButton("GUIDE (G)");
		btnGuid.addActionListener(gbp);
		btnQuite.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_G, 0), "onG");
		btnQuite.getActionMap().put("onG", gbp);
		btnGuid.setForeground(Color.WHITE);
		btnGuid.setBackground(Color.DARK_GRAY);
		btnGuid.setBounds(262, 160, 126, 25);
		frame.getContentPane().add(btnGuid);
		
		JLabel lblTypingBiubiubiu = new JLabel("Typing - biubiubiu");
		lblTypingBiubiubiu.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		lblTypingBiubiubiu.setBounds(122, 30, 198, 44);
		frame.getContentPane().add(lblTypingBiubiubiu);
		
		
	}
}
