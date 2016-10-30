package typebiu;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Bullet extends MoveObject{
	private int stopLocation;
	public Bullet (int x, int y, int xVelo, int yVelo, int width, int height,int stopLocation){
		super(x, y, xVelo, yVelo, width, height);
		this.stopLocation = stopLocation;
		super.setImages(getimage());
		super.changeImage();
	}
	public void update() {
		super.update();
		action();
	}
	private Image[] getimage() {
		Image[] images = new Image[1];
		for (int i = 0; i < images.length; i++) {
			try {
				images[i] = ImageIO.read(new File("res/clash2.png"));
			} catch (IOException e) {
			}
		}
		return images;
	}
	private void action() {
		if (super.getX() == stopLocation) {
			super.setxVelo(0);
		}
	}
}
