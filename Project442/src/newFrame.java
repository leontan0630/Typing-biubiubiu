import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Panel;

public class newFrame {

	private JFrame frame;
	private JTextField textField_1;
	private static String userInput; 
	private static String gameOutput;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private ArrayList<String>para;
	private Panel panel;
	private static BufferedImage image;
	private paintIt img;
	private paintIt img1;
	int check = 0;
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
	public class paintIt extends JPanel{
		int x =0;
		int y= 0;
		int enemy;
		 private BufferedImage img;
		 private BufferedImage peterHit;
	public paintIt(String s, int enemy){
		this.enemy = enemy;
		try {

			img=ImageIO.read(new File(s));
			//System.out.println("n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 @Override
     protected void paintComponent(Graphics g) {
		// System.out.println("n");
		 BufferedImage[] sprite = new BufferedImage[3];
		 //sprite[0]=img.getSubimage(0,0, 120, 250);
		// sprite[1]=img.getSubimage(120,0,100,250);
		// try {
		//	sprite[2] = ImageIO.read(new File("peter.png"));
	//	} catch (IOException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
	//	}
		 Thread thread = new Thread();
		 //sprite[2]=img.getSubimage(240,0,100,250);
		// sprite[3]=
		g.drawImage(img, 0, 0, null);
		repaint();
		if(enemy == 0&& check == 1){
			try {
				peterHit = ImageIO.read(new File("peterHit.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g.drawImage(peterHit, 0, 0, null);
			repaint();
		}
	 }
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(0, 209, 329, 50);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		try{
			String chapterList="the-chapter.txt";
			FileReader inputFile = new FileReader(chapterList);
			BufferedReader bufferReader = new BufferedReader(inputFile);
			String chapter=bufferReader.readLine();
			if(chapter.equals("THE ADVENTURES OF KINTARO, THE GOLDEN BOY")){
				try{
					String fileName="JAPANESE FAIRY TALE//THE ADVENTURES OF KINTARO, THE GOLDEN BOY..txt";
					FileReader input = new FileReader(fileName);
					Scanner scanner = new Scanner(input);
					para=new ArrayList<>();
					String line;
					while(scanner.hasNext()){
						line=scanner.nextLine();
						if(!line.isEmpty()){
							para.add(line);
						}
					}
					//scanner.close();
				}catch(Exception e){
					System.out.println("Error while reading file");
				}
				
			}
			else if(chapter.equals("THE BAMBOO-CUTTER AND THE MOON-CHILD")){
				
				try{
					String fileName="JAPANESE FAIRY TALE//THE BAMBOO-CUTTER AND THE MOON-CHILD..txt";
					//System.out.println(fileName);
					FileReader input = new FileReader(fileName);
					//System.out.println("YEAHHHHHH");
					Scanner scanner = new Scanner(input);
					para=new ArrayList<>();
					String line;
					while(scanner.hasNext()){
						line=scanner.nextLine();
						if(!line.isEmpty()){
							para.add(line);
						}
					}
					//scanner.close();
				}catch(Exception e){
					//System.out.println("NOOOOOOOOOOOOO");
				}
			}
			else if(chapter.equals("THE STORY OF URASHIMA TARO, THE FISHER LAD")){
				try{
					String fileName="JAPANESE FAIRY TALE//THE STORY OF URASHIMA TARO, THE FISHER LAD.txt";
					FileReader input = new FileReader(fileName);
					Scanner scanner = new Scanner(input);
					para=new ArrayList<>();
					String line;
					while(scanner.hasNext()){
						line=scanner.nextLine();
						if(!line.isEmpty()){
							para.add(line);
						}
					}
					//scanner.close();
				}catch(Exception e){
					System.out.println("Error while reading file");
				}
			}
			//bufferReader.close();
		}
		catch(Exception e){
			//System.out.println("here");
			System.out.println("Error while reading file line by line");
		}
		//System.out.println("userInput "+userInput);
		
		AbstractAction ebp = new AbstractAction(){
			public void actionPerformed(ActionEvent e){
				if(!para.isEmpty()){
					String temp=textField_1.getText();
					if(temp.equals(lblNewLabel_1.getText())){
						textField_1.setText(null);;
						lblNewLabel_1.setText(para.get(0));
						para.remove(0);
						check = check + 1;
					}
				}
			}
			
		};
		JButton btnCheck = new JButton("Next");
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(0, 147, 434, 64);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setText(para.get(0));
		para.remove(0);
		btnCheck.addActionListener(ebp); 
		btnCheck.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0),"onENTER");
			//public void actionPerformed(ActionEvent arg0) {
				//userInput = textField_1.getText();
				
			//}
		btnCheck.getActionMap().put("onENTER", ebp);
		btnCheck.setBounds(327, 209, 107, 52);
		
		frame.getContentPane().add(btnCheck);
		img = new paintIt("peter.png",0);
		img1 = new paintIt("chicken.png",1);
		panel = new Panel();
		panel.setBounds(10, 10, 371, 144);
		frame.getContentPane().add(panel);
		panel.add(img);
		panel.add(img1);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		//panel_1.add(comp)
		
		
	}
}
