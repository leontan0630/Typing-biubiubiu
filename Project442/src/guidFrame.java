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

public class guidFrame {
	JFrame frame;
    public static void newGuid()  {
        //new guidFrame();
    }

    public guidFrame() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ex) {
                }
		                
                frame = new JFrame("Typing-biubiubiu");
                frame.setBounds(100, 100, 500, 500);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new menuPane());
		        
                frame.setVisible(true);
            }
        });
    }

    public class menuPane extends JLabel{

        public menuPane() {
            try {
                //setIcon(new ImageIcon(ImageIO.read(new File("bright-colored-backgrounds-1455249.jpg"))));
            	setIcon(new ImageIcon(ImageIO.read(ResourceLoader.load("bright-colored-backgrounds-1455249.jpg"))));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.anchor = GridBagConstraints.CENTER;
    
          
		            
	        
    		
    		 gbc.insets = new Insets(2, 2, 20, 2);
    		 
    		JLabel lblTypingBiubiubiu = new JLabel("First of all thank you for betatesting our game. Since is beta, we only have easy mode for you choose. Hope you enjoy!");// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~write here
    		lblTypingBiubiubiu.setForeground(Color.RED);
    		lblTypingBiubiubiu.setFont(new Font("VTahoma", Font.BOLD, 18));
	    		//lblTypingBiubiubiu.setSize(198, 44);
    		
	    		gbc.gridx = 0;
    		gbc.gridy = 0;
    		 add(lblTypingBiubiubiu,gbc);
    		 
    		 
    		 
    		 AbstractAction bbp = new AbstractAction(){
     			public void actionPerformed(ActionEvent e) {
     				frame.dispose();
	   				settingFrame n =  new settingFrame();
	   				n.newWindow();
     			}
     		};
     		
    		 JButton btnBack = new JButton("Next");
     		btnBack.addActionListener(bbp);
     		btnBack.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_B, 0), "onB");
     		btnBack.getActionMap().put("onB", bbp);
     		btnBack.setBounds(323, 215, 97, 25);
     	//	frame.getContentPane().add(btnBack);
     		gbc.gridx = 0;
     		gbc.gridy =1;
     		add(btnBack,gbc);
        }
    }

}