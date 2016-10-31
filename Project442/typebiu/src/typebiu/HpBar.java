package typebiu;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class HpBar extends JFrame implements Runnable {
    private JProgressBar progress; 
 
    public HpBar(String str) {
        super(str);
        progress = new JProgressBar(1, 100); 
        progress.setStringPainted(true);     
        progress.setBackground(Color.BLACK); 
        this.add(progress);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 600, 70);
        this.setVisible(true);
    }

    public void run() {
        while(true) {
            for(int i=0; i<100; i++) {
                try {
                    progress.setValue(progress.getValue() + 1); 
                    progress.setString(100-progress.getValue() + "HP");
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            progress.setValue(0);
            progress.setString(0+"%");
        }
    }
    }