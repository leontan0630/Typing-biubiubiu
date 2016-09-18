import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Window;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import newFrame.java;
public class Frame extends newFrame {

	private JFrame frame;
	private JFrame newFrame=null;
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
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				newFrame window = new newFrame();
				window.newWindow();
			}
		});
		btnStart.setForeground(Color.WHITE);
		btnStart.setBackground(Color.DARK_GRAY);
		btnStart.setBounds(167, 84, 97, 25);
		frame.getContentPane().add(btnStart);
		
		JButton btnSetting = new JButton("SETTING");
		btnSetting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	//function for setting
			}
		});
		btnSetting.setForeground(Color.WHITE);
		btnSetting.setBackground(Color.DARK_GRAY);
		btnSetting.setBounds(167, 122, 97, 25);
		frame.getContentPane().add(btnSetting);
		
		JButton btnGuid = new JButton("GUIDE");
		btnGuid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //function for guide
			}
		});
		btnGuid.setForeground(Color.WHITE);
		btnGuid.setBackground(Color.DARK_GRAY);
		btnGuid.setBounds(167, 160, 97, 25);
		frame.getContentPane().add(btnGuid);
		
		JButton btnQuite = new JButton("QUIT");
		btnQuite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {   //function for quit
			}
		});
		btnQuite.setForeground(Color.WHITE);
		btnQuite.setBackground(Color.DARK_GRAY);
		btnQuite.setBounds(167, 198, 97, 25);
		frame.getContentPane().add(btnQuite);
		
		JLabel lblTypingBiubiubiu = new JLabel("Typing - biubiubiu");
		lblTypingBiubiubiu.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
		lblTypingBiubiubiu.setBounds(128, 27, 198, 44);
		frame.getContentPane().add(lblTypingBiubiubiu);
	}
}
