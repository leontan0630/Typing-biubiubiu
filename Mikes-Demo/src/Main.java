
import javax.swing.SwingUtilities;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
    private static void createAndShowGUI() {
    	// Setting up a frame
        System.out.println("Created GUI on EDT? "+
        SwingUtilities.isEventDispatchThread());
       
        
        JFrame f = new JFrame("Swing Paint Demo");
        JPanel p = new JPanel();
        
        
        
        
        
        
        //p.setLayout(new BorderLayout());
        p.setBackground(Color.blue);
        
        
        
        //p.setSize(1050,250);
        p.setLayout(new GridLayout(1, 2));
        
        
        
        
        // Adding an image to a frame
        f.getContentPane().setLayout(new FlowLayout());
       f.getContentPane().setBackground(Color.red);
        try {
        	Image img = ImageIO.read(new File("src/1.PNG"));
        	p.add(new JLabel(new ImageIcon(img)));
        	JButton b = new JButton("Test");
        	b.setPreferredSize(new Dimension(40, 40));
        	p.add(b);
        	b.setPreferredSize(new Dimension(40, 40));
        } catch (IOException e) { System.out.println("failed"); System.out.println(System.getProperty("user.dir")); }
        f.getContentPane().add(p);
        
        
        // Setting dimensions to frame and exit condition
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setVisible(true);
    }
}
