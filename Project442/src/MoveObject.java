
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class MoveObject {
	public Image[] getImages() {
		return images;
	}

	public void setImages(Image[] images) {
		this.images = images;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getxVelo() {
		return xVelo;
	}

	public void setxVelo(int xVelo) {
		this.xVelo = xVelo;
	}

	public int getyVelo() {
		return yVelo;
	}

	public void setyVelo(int yVelo) {
		this.yVelo = yVelo;
	}
	public int getHealth(){
		return health;
	}
	public void setHealth(int health){
		health = enemy.getX();
		this.health = health;
		
	}
	
	public boolean getCorrect(){
		return correct;
	}
	public void setCorrect(boolean correct){
		this.correct = correct;
	}
	
	private Image[] images;
	private int imageOffset;
	private int x;
	private int y;
	private int xVelo;
	private int yVelo;
	private int width;
	private int height;
	private int health;
	private boolean correct;
	private Hero hero;
	private Enemy enemy;
	
	public MoveObject(int x, int y, int xVelo, int yVelo, int width, int height) {
		this.x = x;
		this.y = y;
		this.xVelo = xVelo;
		this.yVelo = yVelo;
		this.width = width;
		this.height = height;
	}
	public void changeImage() {
		for (int i = 0; i < images.length; i++) {
			BufferedImage buffered = new BufferedImage(width, height,
					BufferedImage.TYPE_4BYTE_ABGR_PRE);
			buffered.getGraphics().drawImage(images[i], 0, 0, width, height,
					null);
			images[i] = buffered;
		}
	}

	public void update() {
		x = x + xVelo;
		y = y + yVelo;
		if (imageOffset < images.length - 1) {
			imageOffset++;
		} else {
			imageOffset = 0;
		}
	}

	public void draw(Graphics g) {
		g.drawImage(images[imageOffset], x, y, null);
	}

}
