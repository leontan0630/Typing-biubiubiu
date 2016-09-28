import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.JLabel;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class newFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private static String userInput; 
	private static String gameOutput;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	/**
	 * Launch the application.
	 */
	public static void newWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newFrame window = new newFrame();
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
	public newFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		gameOutput = "abc";
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(163, 62, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(gameOutput);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 153, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		//System.out.println("userInput "+userInput);
		AbstractAction cbp = new AbstractAction(){
			public void actionPerformed(ActionEvent arg0) {
				userInput = textField_1.getText();
			
				if(gameOutput.equals(userInput)){
					lblNewLabel_1.setText("SUCCESS!!!!");
					//textField_2.setText("pass");
				
					}else{
						lblNewLabel_1.setText("FAIL!!!!!");
						//System.out.println();
						//textField_2.setText("fail");
					}
			}
		};
		JButton btnCheck = new JButton("CHECK");
		btnCheck.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "onENTER");
		btnCheck.getActionMap().put("onENTER", cbp);
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(163, 86, 116, 64);
		frame.getContentPane().add(lblNewLabel_1);
		btnCheck.addActionListener(cbp);		
		btnCheck.setBounds(291, 152, 97, 25);
		frame.getContentPane().add(btnCheck);
		
		
		
		
		
	}
}
