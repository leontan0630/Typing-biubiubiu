
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Enemy extends MoveObject {
	private int stopLocation;
	public Enemy(int x, int y, int xVelo, int yVelo, int width, int height,int stopLocation) {
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
		Image[] images = new Image[4];
		for (int i = 0; i < images.length; i++) {
			try {
				//images[i] = ImageIO.read(new File("things/chicken" + (i + 1) + ".png"));
				//setIcon(new ImageIcon(ImageIO.read(ResourceLoader.load("bright-colored-backgrounds-1455249.jpg"))));
				images[i] = ImageIO.read(ResourceLoader.load("chicken" + (i + 1) + ".png"));
			} catch (IOException e) {
			}
		}
		return images;
	}
	private void action() {
		if (super.getX() < stopLocation) {
			super.setxVelo(-100000);
		}
	}
}
