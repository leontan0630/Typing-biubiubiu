package typebiu;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
public class Canvas extends JPanel {
	public Hero hero;
	private Background background;
	public Enemy enemy;
	public Bullet bullet;
	
	
	public Canvas() {
		hero = new Hero(0, 300, 0, 0, 100, 100, 600);//character setting
		background = new Background(0, 0, 0, 0, 800, 550);// background setting
		enemy = new Enemy(600, 170, -1, 0, 100, 220,hero.getX());
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
