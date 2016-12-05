package typebiu;
import javax.swing.AbstractAction;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

public class ChickenFrame extends JFrame {
	
	private JLabel lblNewLabel;
	private ImageIcon image;
    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private myFrames canvas;
	private Drawing drawing;
	private int bulletFly;
	private JLabel loose;
	
	private JTextField textField_1;
	private ArrayList<String>para;
	int check = 0;
   // private JFrame frame;
    public ChickenFrame() {
    	
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
        
        
        
        JLabel lblNewLabel_1 = new JLabel("1234567890"); 
        lblNewLabel_1.setBounds(12, 705, 776, 16);
        canvas.add(lblNewLabel_1);
        
        JButton btnCheck = new JButton("CHECK");
        btnCheck.setBounds(691, 742, 97, 25);
        canvas.add(btnCheck);
        
        textField = new JTextField();
        textField.setBounds(12, 745, 667, 22);
        canvas.add(textField);
        textField.setColumns(10);
        
         lblNewLabel = new JLabel();
        //lblNewLabel.setFont(new Font("293, 655, 16141, 25, 32));
        lblNewLabel.setBounds(360, 660, 56, 16);
        canvas.add(lblNewLabel);
        
        
        
     
        
        
        
       
        
       
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
						
						if(delay!= 5){
							delay = delay +1;
							canvas.enemy.setWidth(100);
							canvas.enemy.setHeight(220);
							canvas.enemy.setX(600);
							canvas.bullet.setX(0);
							canvas.bullet.setxVelo(0);
							System.out.println("chicken "+canvas.enemy.getX());
							canvas.hero.setCorrect(false);
						}
						
					}
					}else{
						delay = 0;
					}
				if(canvas.hero.getX() == canvas.enemy.getX()){
					
					lblNewLabel.setText("FAIL");
				
				}
				
				System.out.println("bullet "+canvas.bullet.getHeight());
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
            	ChickenFrame main = new ChickenFrame();
            	main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
    	hero = new Hero(0, 300, 0, 0, 100, 100, 600);//character setting
		background = new Background(0, 0, 0, 0, 800, 550);// background setting
		enemy = new Enemy(600, 170, -10, 0, 100, 220,hero.getX());
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