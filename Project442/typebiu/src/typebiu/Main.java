package typebiu;


public class Main {
	public static void main(String s[]) {
		MyJFrame gameframe = new MyJFrame();
		gameframe.setVisible(true);
		
		//
		//HpBar pb = new HpBar("Hero hp");
        //Thread t = new Thread(pb);
        //t.start();
        MyJFrame a = new MyJFrame("hp");
        Thread t = new Thread(a);
        t.start();
	}
}
