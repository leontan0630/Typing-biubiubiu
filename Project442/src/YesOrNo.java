import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class YesOrNo {
	private JFrame frame;
    public static void choose()  {
        //new YesOrNo();
    }

    public YesOrNo() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ex) {
                }
		                
                frame = new JFrame("Typing-biubiubiu");
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
            	setIcon(new ImageIcon(ImageIO.read(ResourceLoader.load("bright-colored-backgrounds-1455249.jpg"))));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.anchor = GridBagConstraints.CENTER;
            gbc.insets = new Insets(2, 2, 15, 2);
            
            JLabel lblChapter = new JLabel("What you wanna do next:");
    		lblChapter.setFont(new Font("Tahoma", Font.PLAIN, 17));
    		lblChapter.setForeground(Color.ORANGE);
    		//lblChapter.setBounds(118, 11, 188, 37);
    		gbc.gridx = 0;
    		gbc.gridy = 0;
    		add(lblChapter,gbc);
    		
    		
    		gbc.insets = new Insets(2, 2, 10, 2);
		            
    		JButton btnNewButton = new JButton("Retry");
    		
    		btnNewButton.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				
    				frame.dispose();
    				booksFrame n = new booksFrame();
    				n.booksFrame();
    			}
    		});
    		
    		
    		gbc.gridx = 0;
    		gbc.gridy = 1;
    		add(btnNewButton,gbc);
   		
    		JButton btnNewButton_1 = new JButton(" Exit ");
    		
    		btnNewButton_1.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				
    				frame.dispose();
    				
    			}
    		});
    		gbc.gridx = 0;
    		gbc.gridy = 2;
    		add(btnNewButton_1,gbc);
    		//btnNewButton_1.setBounds(51, 145, 308, 25);
    		//add(btnNewButton_1);
    		
    		
    		
        }
    }

}

