package typebiu;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.sun.glass.events.KeyEvent;

import javax.swing.JTextField;
import javax.swing.KeyStroke;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

public class MyJFrame extends JFrame {
	private Canvas canvas;
	private Drawing drawing;
	private int bulletFly;
	private JLabel loose;
	
	private JTextField textField_1;
	private ArrayList<String>para;
	int check = 0;
	public MyJFrame() {
		setTitle("HeroDemo");
		this.setSize(946, 646);
		this.setLocation(300, 300);
		setResizable(false);
	
		addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent e) {
				drawing = new Drawing();
				drawing.start();
			}
		});
		getContentPane().setLayout(null);
		canvas = new Canvas();
		canvas.setBounds(0, 0, 747, 465);
		canvas.setBackground(Color.WHITE);
		getContentPane().add(canvas);
		canvas.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblYouLose = new JLabel("You lose");
		lblYouLose.setBounds(645, 478, 118, 54);
		
		lblYouLose.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 32));
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 545, 639, 53);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JButton btnCheck = new JButton("New button");
		btnCheck.setBounds(666, 544, 107, 40);
		getContentPane().add(btnCheck);
		
		JLabel lblYouLoose = new JLabel("You loose");
		lblYouLoose.setBounds(32, 478, 85, 31);
		loose = lblYouLose;
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
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(10, 478, 623, 54);
		getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setText(para.get(0));
		
		para.remove(0);
		//getContentPane().add(lblYouLoose);
	//	 Shape rectangle = new Rectangle2D.Float(x, 300, 5, 5);
		AbstractAction ebp = new AbstractAction(){
			public void actionPerformed(ActionEvent e){
				if(!para.isEmpty()){
					String temp=textField_1.getText();
					if(temp.equals(lblNewLabel_1.getText())){
						canvas.hero.setCorrect(true);
						textField_1.setText(null);;
						lblNewLabel_1.setText(para.get(0));
						para.remove(0);
						check = check + 1;
					}
				}
			}
			
		};
		
		btnCheck.addActionListener(ebp); 
		btnCheck.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0),"onENTER");
		btnCheck.getActionMap().put("onENTER", ebp);
	}
	public Canvas getCanvas(){
		return this.canvas;
	}
	public class Drawing extends Thread {
		private boolean flag = true;
		public void setFlag(boolean flag) {
			this.flag = flag;
		}
		
		public void run() {
			int delay = 0;
			int bulletTravel = 0;
			while (flag) {
				canvas.updateCanvas();
				try {
					
					if(canvas.hero.getCorrect()){
						canvas.bullet.setxVelo(20);
						canvas.bullet.setWidth(50);
						canvas.bullet.setHeight(10);
						if(canvas.enemy.getX()-canvas.bullet.getX()<=10){
							canvas.enemy.setWidth(0);
							canvas.enemy.setHeight(0);
							
							if(delay!= 5){
								delay = delay +1;
								canvas.enemy.setWidth(100);
								canvas.enemy.setHeight(220);
								canvas.enemy.setX(600);
								System.out.println("chicken "+canvas.enemy.getX());
								canvas.hero.setCorrect(false);
							}
							
						}
						}else{
							delay = 0;
						}
					if(canvas.hero.getX() == canvas.enemy.getX()){

						JLabel lblNewLabel = new JLabel();
						lblNewLabel.setBounds(645, 478, 144, 46);
						getContentPane().add(lblNewLabel);
						lblNewLabel.setText("lose");
					}
					
					System.out.println("bullet "+canvas.bullet.getHeight());
					sleep(100);
				} catch (InterruptedException e) {
				}
			}
		}

	}
}
