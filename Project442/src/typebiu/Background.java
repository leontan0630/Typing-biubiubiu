package typebiu;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Background extends MoveObject{

	public Background(int x, int y, int xVelo, int yVelo, int width, int height) {
		super(x, y, xVelo, yVelo, width, height);
		super.setImages(getimage());
		super.changeImage();
	}
	public Image[] getimage() {
		Image[] pic = new Image[1];
		try {
			pic[0] = ImageIO.read(new File("res/background.png"));
		} catch (IOException e) {
		}
		return pic;
	}

}

