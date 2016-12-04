package typebiu;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class MyJFrame extends JFrame implements Runnable {
	static boolean check;
	private Canvas canvas;
	private Drawing drawing;
	private JProgressBar progress;
	

	
	
	
	public MyJFrame() {
		 
		
		setTitle("HeroDemo");
		this.setSize(753, 500);
		this.setLocation(300, 300);
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent e) {
				drawing = new Drawing();
				drawing.start();
			}
		});
		canvas = new Canvas();
		canvas.setBackground(Color.WHITE);
		getContentPane().add(canvas, BorderLayout.CENTER);

			
		
	}

	

	
	public MyJFrame(String str){
		super(str);
        progress = new JProgressBar(1, 100); 
        progress.setStringPainted(true);     
        progress.setBackground(Color.BLACK); 
        this.add(progress);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 755, 70);
        this.setVisible(true);
		
	}
	
	
	
	


	  
	
	
	public class Drawing extends Thread {
		private boolean flag = true;
		public void setFlag(boolean flag) {
			this.flag = flag;
		}
		
		public void run() {
			while (flag) {
				canvas.updateCanvas();
				
				try {
					
					if(canvas.bullet.getX() == canvas.enemy.getX()){
						//System.out.print("yes");
						check=true;
						System.out.print(check);
						//while(check==true){
						//	  Thread.sleep(10000);
							 
							//}
						
					}
					else{
						//System.out.print("No");
						//check=false;
						
					}
					sleep(50);
				}
				
				catch (InterruptedException e) {
				}
			}
		}

	
	}
	
	
	
	
	public void run() {
		System.out.print(check);// check the state.
		
			try {
				Thread.sleep(5200);// put the thread to wait, until bullet hit object
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.print(check);//after after bullet shot the enemy, state changes.
		
        while(check==true) {// verifying the state, if bullet does hit enemy, reduce hp point
        	
                try {
                	//Thread.sleep(5000);
                	
                    progress.setValue(progress.getValue() + 50);//reduce HP when bullets hit object
                	
                	progress.setString(0-progress.getValue() + "HP");
                	//check=false;
                	
                	Thread.sleep(100000);
                    
                    
        	}
               catch (InterruptedException e) {
                    e.printStackTrace();
                }
               
            
           // progress.setValue(0);// stops at 0.
            //progress.setString(0+"%");// stops at 0.
        }
    }
	 
	
	
	  

}
