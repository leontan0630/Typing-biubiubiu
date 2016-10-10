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

public class Canvas extends JPanel {
	private Hero hero;
	private Background background;
	public Canvas() {
		hero = new Hero(0, 300, 5, 0, 100, 100, 600);//character setting
		background = new Background(0, 0, 0, 0, 800, 550);// background setting
	}

	public void paint(Graphics g) {
		super.paint(g);
		background.draw(g);
		hero.draw(g);
	}
	
	public void updateCanvas() {
		hero.update();
		repaint();
	}
}
