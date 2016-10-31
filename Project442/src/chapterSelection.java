import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class chapterSelection {

    public static void newChapter()  {
        new chapterSelection();
    }

    public chapterSelection() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ex) {
                }
		                
                JFrame frame = new JFrame("ChapterSelection");
                frame.setBounds(100, 100, 450, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new menuPane());
		               // frame.pack();
		                //frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class menuPane extends JLabel{

        public menuPane() {
            try {
                setIcon(new ImageIcon(ImageIO.read(new File("bright-colored-backgrounds-1455249.jpg"))));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.anchor = GridBagConstraints.CENTER;
            gbc.insets = new Insets(2, 2, 10, 2);
          
		            
            JLabel lblChapter = new JLabel("CHAPTER SELECTION:");
    		lblChapter.setFont(new Font("Tahoma", Font.PLAIN, 17));
    		lblChapter.setBounds(110, 35, 188, 37);
    		
    		gbc.gridx = 0;
    		gbc.gridy = 0;
    		add(lblChapter,gbc);
   		
    		JButton btnNewButton = new JButton("ONE");
    		
    	
    		gbc.gridx = 0;
    		gbc.gridy = 1;
    		add(btnNewButton,gbc);
    		
    		JButton btnNewButton_1 = new JButton("TWO");
    		gbc.gridx = 0;
    		gbc.gridy = 2;
    		add(btnNewButton_1,gbc);
    
    		JButton btnNewButton_2 = new JButton("THREE");
    		gbc.gridx = 0;
    		gbc.gridy = 3;
    		add(btnNewButton_2,gbc);
    		
        }
    }

}
