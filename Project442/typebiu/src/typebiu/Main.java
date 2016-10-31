package typebiu;


public class Main {
	public static void main(String s[]) {
		MyJFrame gameframe = new MyJFrame();
		gameframe.setVisible(true);
		
		
		HpBar pb = new HpBar("HP Bar");
        Thread t = new Thread(pb);
        t.start();
        
	}
}
