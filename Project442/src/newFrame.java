import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class newFrame {

	private JFrame frame;
	private JTextField textField_1;
	private static String userInput; 
	private static String gameOutput;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private ArrayList<String>para;
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
		
		textField_1 = new JTextField();
		textField_1.setBounds(0, 209, 329, 50);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		try{
			String fileName="Japanese Fairy Tale.txt";
			FileReader inputFile = new FileReader(fileName);
			BufferedReader bufferReader = new BufferedReader(inputFile);
			para=new ArrayList<>();
			String line;
			while(para.size()!=100){
				line=bufferReader.readLine();
				if(!line.isEmpty()){
					para.add(line);
				}
			}
		}
		catch(Exception e){
			System.out.println("Error while reading file line by line");
		}
		//System.out.println("userInput "+userInput);
		JButton btnCheck = new JButton("Next");
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(0, 147, 434, 64);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setText(para.get(0));
		para.remove(0);
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//userInput = textField_1.getText();
				while(!para.isEmpty()){
					lblNewLabel_1.setText(para.get(0));
					para.remove(0);
					break;
				}
				//if(gameOutput.equals(userInput)){
					//lblNewLabel_1.setText("SUCCESS!!!!");
					//textField_2.setText("pass");
				
					//}else{
						//lblNewLabel_1.setText("FAIL!!!!!");
						//System.out.println();
						//textField_2.setText("fail");
					//}
			}
		});
		btnCheck.setBounds(327, 209, 107, 52);
		frame.getContentPane().add(btnCheck);
		
		
		
		
		
	}
}
