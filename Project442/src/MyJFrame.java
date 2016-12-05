

import javax.swing.AbstractAction;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.SwingConstants;


import javax.swing.JTextField;
import javax.swing.KeyStroke;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

public class MyJFrame extends JFrame {
	private JLabel lblNewLabel;
	private Drawing drawing;
	private myFrames canvas;
	private int bulletFly;
	private JLabel loose;
	private String mix = new String();
	private JTextField textField_1;
	private ArrayList<String>para=new ArrayList<>();
	int check = 0;
	int score = 0;
	private JTextField textField;
	private PrintWriter outputStream;
	public MyJFrame() {
		setTitle("HeroDemo");
		getContentPane().setBackground(Color.ORANGE);
        Box box = new Box(BoxLayout.Y_AXIS);
        box.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        box.add(Box.createVerticalGlue());
        canvas = new myFrames();
        box.add(canvas);
        canvas.setLayout(null);
	
		addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent e) {
				drawing = new Drawing();
				drawing.start();
			}
		});
		String fileName1 = "rank.txt";
		try {
			 outputStream = new PrintWriter(new FileWriter(fileName1, true));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("notfound");
		}
		textField_1 = new JTextField();
		textField_1.setBounds(12, 675, 776, 53);
		canvas.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setEditable(false);
		lblNewLabel = new JLabel();
        //lblNewLabel.setFont(new Font("293, 655, 16141, 25, 32));
        lblNewLabel.setBounds(360, 660, 56, 16);
        canvas.add(lblNewLabel);
		
		
		JButton btnCheck = new JButton("CHECK");
        btnCheck.setBounds(691, 742, 97, 25);
        canvas.add(btnCheck);
		
		try{
			//String chapterList="things/the-chapter.txt";
			//String chapterList = ResourceLoader.load("the-chapter.txt");
			//InputStream inputFile = ResourceLoader.load("the-chapter.txt");
			String chapterList="the-chapter.txt";
			FileReader inputFile = new FileReader(chapterList);
			//BufferedReader bufferReader = new BufferedReader(inputFile);
			//InputStreamReader inputFile= new InputStreamReader(this.getClass().getResourceAsStream("the-chapter.txt"));
			Scanner scannert = new Scanner(inputFile);
			String chapter=scannert.nextLine();
			if(chapter.equals("The Orange Girl")){
				try{
					//String fileName="things/LONDON TOWN/The Orange Girl.txt";
					InputStream fileName = ResourceLoader.load("LONDON TOWN/The Orange Girl.txt");
					//FileReader input = new FileReader(fileName);
					//InputStreamReader fileName= new InputStreamReader(this.getClass().getResourceAsStream("LONDON TOWN/The Orange Girl.txt"));
					Scanner scanner = new Scanner(fileName);
					para=new ArrayList<>();
					String line;
					while(scanner.hasNext()){
						line=scanner.nextLine();
						if(!line.isEmpty()){
							//para.add(line);
							mix=mix+line;
						}
					}
					//scanner.close();
				}catch(Exception e){
					System.out.println("Error while reading file");
				}
			}
			else if(chapter.equals("The Tower of London")){
				
				try{
					//String fileName="things/LONDON TOWN/The Tower of London.txt";
					//System.out.println(fileName);
					//FileReader input = new FileReader(fileName);
					//System.out.println("YEAHHHHHH");
					//String fileName="things/LONDON TOWN/The Orange Girl.txt";
					InputStream fileName = ResourceLoader.load("LONDON TOWN/The Tower of London.txt");
					//FileReader input = new FileReader(fileName);
					//InputStreamReader fileName= new InputStreamReader(this.getClass().getResourceAsStream("LONDON TOWN/The Tower of London.txt"));
					Scanner scanner = new Scanner(fileName);
					
					para=new ArrayList<>();
					String line;
					while(scanner.hasNext()){
						line=scanner.nextLine();
						if(!line.isEmpty()){
							//para.add(line);
							mix=mix+line;
						}
					}
					//scanner.close();
				}catch(Exception e){
					//System.out.println("NOOOOOOOOOOOOO");
				}
			}
			else if(chapter.equals("The Tower")){
				try{
					String fileName="things/LONDON TOWN//The Tower.txt";
					FileReader input = new FileReader(fileName);
					Scanner scanner = new Scanner(input);
					para=new ArrayList<>();
					String line;
					while(scanner.hasNext()){
						line=scanner.nextLine();
						if(!line.isEmpty()){
							//para.add(line);
							mix=mix+line;
						}
					}
					//scanner.close();
				}catch(Exception e){
					System.out.println("Error while reading file");
				}
			}
			else if(chapter.equals("CHRISTMAS DAY")){
				try{
					//String fileName="things/THE NIGHT BEFORE CHRISTMAS/CHRISTMAS DAY..txt";
					InputStream fileName = ResourceLoader.load("THE NIGHT BEFORE CHRISTMAS/CHRISTMAS DAY..txt");
					Scanner scanner = new Scanner(fileName);
					//System.out.println(fileName);
					//FileReader input = new FileReader(fileName);
					//System.out.println("YEAHHHHHH");
					//Scanner scanner = new Scanner(input);
					para=new ArrayList<>();
					String line;
					while(scanner.hasNext()){
						line=scanner.nextLine();
						if(!line.isEmpty()){
							//para.add(line);
							mix=mix+line;
						}
					}
					//scanner.close();
				}catch(Exception e){
					//System.out.println("NOOOOOOOOOOOOO");
				}
			}
			else if(chapter.equals("THE NIGHT AFTER CHRISTMAS")){
				try{
					//String fileName="things/THE NIGHT BEFORE CHRISTMAS/THE NIGHT AFTER CHRISTMAS..txt";
					//System.out.println(fileName);
					//FileReader input = new FileReader(fileName);
					//System.out.println("YEAHHHHHH");
					//Scanner scanner = new Scanner(input);
					InputStream fileName = ResourceLoader.load("THE NIGHT BEFORE CHRISTMAS/THE NIGHT AFTER CHRISTMAS..txt");
					Scanner scanner = new Scanner(fileName);
					para=new ArrayList<>();
					String line;
					while(scanner.hasNext()){
						line=scanner.nextLine();
						if(!line.isEmpty()){
							//para.add(line);
							mix=mix+line;
						}
					}
					//scanner.close();
				}catch(Exception e){
					//System.out.println("NOOOOOOOOOOOOO");
				}
			}
			else if(chapter.equals("THE NIGHT BEFORE CHRISTMAS")){
				try{
					//String fileName="things/THE NIGHT BEFORE CHRISTMAS/THE NIGHT BEFORE CHRISTMAS..txt";
					//System.out.println(fileName);
					//FileReader input = new FileReader(fileName);
					//System.out.println("YEAHHHHHH");
					//Scanner scanner = new Scanner(input);
					InputStream fileName = ResourceLoader.load("THE NIGHT BEFORE CHRISTMAS/THE NIGHT BEFORE CHRISTMAS..txt");
					Scanner scanner = new Scanner(fileName);
					para=new ArrayList<>();
					String line;
					while(scanner.hasNext()){
						line=scanner.nextLine();
						if(!line.isEmpty()){
							//para.add(line);
							mix=mix+line;
						}
					}
					//scanner.close();
				}catch(Exception e){
					//System.out.println("NOOOOOOOOOOOOO");
				}
			}
			
		}
		catch(Exception e){
			System.out.println("Error while reading file line by line");
		}
		//System.out.println(mix);
		StringTokenizer st=new StringTokenizer(mix,",!?.");
		int count=0;
		
		while(st.hasMoreTokens()){
			para.add(count,st.nextToken());
			count=count+1;
		}
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(27, 619, 761, 16);
		canvas.add(lblNewLabel_1);
		
		StringTokenizer multiTokenizer;
		lblNewLabel_1.setText(para.get(0));
		
		JLabel lblYourName = new JLabel("Your Name:");
		lblYourName.setBounds(22, 746, 89, 25);
		canvas.add(lblYourName);
		
		textField = new JTextField();
		textField.setBounds(110, 749, 116, 22);
		canvas.add(textField);
		textField.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(234, 748, 97, 25);
		canvas.add(btnConfirm);
		
		JLabel lblYourScore = new JLabel("Your Score:");
		lblYourScore.setBounds(400, 746, 80, 25);
		canvas.add(lblYourScore);
		
		JLabel lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setBounds(478, 747, 80, 23);
		canvas.add(lblNewLabel_2);
		para.remove(0);
		//getContentPane().add(lblYouLoose);
	//	 Shape rectangle = new Rectangle2D.Float(x, 300, 5, 5);
		AbstractAction ebp = new AbstractAction(){
			public void actionPerformed(ActionEvent e){
				if(!para.isEmpty()){
					String temp=textField_1.getText();
					if(temp.equals(lblNewLabel_1.getText())){
						canvas.hero.setCorrect(true);
						textField_1.setText(null);
						
							lblNewLabel_1.setText(para.get(0).substring(1));
							para.remove(0);
							check = check + 1;
							score = score  + 100;
							lblNewLabel_2.setText(String.valueOf(score));
					}
				}
			}
			
		};
		AbstractAction enterName = new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText()!=""){
				textField_1.setEditable(true);
				textField.setEditable(false);
				btnCheck.addActionListener(ebp); 
				btnCheck.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0),"onENTER");
				btnCheck.getActionMap().put("onENTER", ebp);
				canvas.enemy.setxVelo(-3);
				
				}
				
			}
			
		};
		btnConfirm.addActionListener(enterName);
		btnConfirm.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0),"onENTER");
		btnConfirm.getActionMap().put("onENTER", enterName);
		
	//	btnCheck.addActionListener(ebp); 
		//btnCheck.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0),"onENTER");
		//btnCheck.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0),"onENTER");
	//	btnCheck.getActionMap().put("onENTER", ebp);
		//btnCheck.setBounds(327,209,107,52);
		 box.add(Box.createVerticalGlue());
	        getContentPane().add(box);
	        pack();
	        setTitle("BOOKS");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setMaximumSize(getMinimumSize());
	        setMinimumSize(getMinimumSize());
	        setPreferredSize(getPreferredSize());
	        setLocation(150, 150);
	        setVisible(true);
	}
	public myFrames getCanvas(){
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
							
							if(delay!= 10){
								delay = delay +1;
								canvas.enemy.setWidth(100);
								canvas.enemy.setHeight(220);
								canvas.enemy.setX(600);
								canvas.bullet.setX(0);
								canvas.bullet.setxVelo(0);
								//System.out.println("chicken "+canvas.enemy.getX());
								canvas.hero.setCorrect(false);
							}
							
						}
						}else{
							delay = 0;
						}
					if(canvas.hero.getX() == canvas.enemy.getX()){
						outputStream.write(textField.getText()+" "+String.valueOf(score)+"\n");
						outputStream.close();
						lblNewLabel.setText("FAIL");
						this.stop();
					}
					
					//System.out.println("bullet "+canvas.bullet.getHeight());
					sleep(100);
				} catch (InterruptedException e) {
				}
			}
			
		}

	}
	  public static void main(String[] args) {
	        Runnable r = new Runnable() {

	            @Override
	            public void run() {
	            	//MyJFrame main = new MyJFrame();
	            	//main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            }
	        };
	        javax.swing.SwingUtilities.invokeLater(r);
	    }
}
class myFrames extends JPanel {
	

    private static final long serialVersionUID = 1L;
    public Hero hero;
	private Background background;
	public Enemy enemy;
	public Bullet bullet;
    @Override
    public Dimension getMinimumSize() {
        return new Dimension(800, 800);
    }

    @Override
    public Dimension getMaximumSize() {
        return new Dimension(800, 800);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 800);
    }

   /* @Override
    public void paintComponent(Graphics g) {
        int margin = 10;
        Dimension dim = getSize();
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(margin, margin, dim.width - margin * 2, dim.height - margin * 2);
    }*/
    
    public myFrames(){
    	super();
    	int margin = 0;
    	this.setBackground(Color.ORANGE);
    	Dimension dim = getSize();
    	JButton jb = new JButton("10");
        
    	this.setBounds(margin, margin, dim.width - margin * 2, dim.height - margin * 2);
    	hero = new Hero(0, 450, 0, 0, 100, 100, 600);//character setting
		background = new Background(0, 0, 0, 0, 800, 550);// background setting
		enemy = new Enemy(600, 330, 0, 0, 100, 220,hero.getX());
		bullet = new Bullet(hero.getX(),hero.getY(),0,0,50,10,enemy.getX());
    }
    	
    	
    	public void paint(Graphics g) {
    		super.paint(g);
    		background.draw(g);
    		hero.draw(g);
    		enemy.draw(g);
    		bullet.draw(g);
    	}
    	
    	public void updateCanvas() {
    		hero.update();
    		enemy.update();
    		bullet.update();
    		repaint();
    	}
    	
    
}
