package Typingbiu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class animation extends JPanel implements ActionListener{
	int playerhealthbar;
	int monsterhealthbar;
	
	Timer tm = new Timer(5,this);
	int positionhorizontal=0;
	int speed=2;
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.fillRect(30,30,50,30);
		
		tm.start();
	}
	
	public void actionPerformed(ActionEvent e){
		if(positionhorizontal<0||positionhorizontal>550)
			speed=-speed;
			
		positionhorizontal=positionhorizontal+speed;
		repaint();
	}
	
	public static void main(String[] args) {
		animation a = new animation();
		JFrame aframe= new JFrame();
		aframe.setTitle("Typingbiubiubiu");
		aframe.setSize(600, 400);
		aframe.setVisible(true);
		aframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aframe.add(a);
	}
	
	
	
	public class player{
		
	}
	
	public class monster{
		
	}
	
	
}
