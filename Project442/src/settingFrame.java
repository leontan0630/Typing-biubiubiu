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

public class settingFrame{
	private JFrame frame;
    public static void newWindow() {
        //new settingFrame();
    }

    public settingFrame() {
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
		               
                frame.setVisible(true);
            }
        });
    }

    public class menuPane extends JLabel {

        public menuPane() {
            try {
                //setIcon(new ImageIcon(ImageIO.read(new File("things/bright-colored-backgrounds-1455249.jpg"))));
            	setIcon(new ImageIcon(ImageIO.read(ResourceLoader.load("bright-colored-backgrounds-1455249.jpg"))));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.anchor = GridBagConstraints.CENTER;
            
            gbc.insets = new Insets(1, 1, 10, 1);
           
		            
            AbstractAction ebp = new AbstractAction(){
    			public void actionPerformed(ActionEvent e) {
    				frame.dispose();
    				booksFrame n = new booksFrame();
    				n.booksFrame();
    			}
    		};
    		JButton btnEasy = new JButton("  EASY  (E)  ");
    		btnEasy.addActionListener(ebp);
    		btnEasy.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_E, 0), "onE");
    		btnEasy.getActionMap().put("onE", ebp);
    		btnEasy.setSize(105, 25);
    		btnEasy.setForeground(Color.GREEN);
    		btnEasy.setBackground(Color.WHITE);
    		gbc.gridx = 0;
    		gbc.gridy = 1;
    		add(btnEasy,gbc);
    		//frame.getContentPane().add(btnEasy);
    		
    		AbstractAction mbp = new AbstractAction(){
    			public void actionPerformed(ActionEvent e) {
    				frame.dispose();
    				//newFrame n = new newFrame();
    				//n.newWindow();
    			}
    		};
    		JButton btnMedium = new JButton("MEDIUM (M)");
    		btnMedium.addActionListener(mbp);
    		btnMedium.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_M, 0), "onM");
    		btnMedium.getActionMap().put("onM", mbp);
    		btnMedium.setForeground(Color.YELLOW);
    		btnMedium.setBackground(Color.WHITE);
    		btnMedium.setSize( 105, 25);
    		gbc.gridx = 0;
    		gbc.gridy = 2;
    		add(btnMedium,gbc);
    		//frame.getContentPane().add(btnMedium);
    		
    		AbstractAction hbp = new AbstractAction(){
    			public void actionPerformed(ActionEvent e) {
    				frame.dispose();
    			}
    		};
    		JButton btnHard = new JButton("  HARD  (H)  ");
    		btnHard.addActionListener(mbp);
    		btnHard.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_H, 0), "onH");
    		btnHard.getActionMap().put("onH", hbp);
    		btnHard.setForeground(Color.ORANGE);
    		btnHard.setBackground(Color.WHITE);
    		//btnHard.setBounds(167, 160, 105, 25);
    		gbc.gridx = 0;
    		gbc.gridy = 3;
    		add(btnHard,gbc);
    		//frame.getContentPane().add(btnHard);
    		
    		AbstractAction ibp = new AbstractAction(){
    			public void actionPerformed(ActionEvent e) {
    				frame.dispose();
    			}
    		};
    		JButton btnInsane = new JButton(" INSANE  (I) ");
    		btnInsane.addActionListener(ibp);
    		btnInsane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_I, 0), "onI");
    		btnInsane.getActionMap().put("onI", ibp);
    		btnInsane.setForeground(Color.RED);
    		btnInsane.setBackground(Color.WHITE);
    	//	btnInsane.setBounds(167, 198, 105, 25);
    		gbc.gridx = 0;
    		gbc.gridy = 4;
    		 add(btnInsane,gbc);
    		//frame.getContentPane().add(btnInsane);
    		
    		
    		
    		AbstractAction bbp = new AbstractAction(){
    			public void actionPerformed(ActionEvent e) {
    				frame.dispose();
    			}
    		};
    		
    		
    		
    		gbc.gridx = 0;
    		gbc.gridy = 0;
    		 
    		
    		gbc.insets = new Insets(1, 1, 10, 1);
    		 
    		JLabel lblTypingBiubiubiu = new JLabel("SELECT DIFFICULTY:");
     		lblTypingBiubiubiu.setForeground(Color.ORANGE);
     		lblTypingBiubiubiu.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
     		lblTypingBiubiubiu.setBounds(110, 30, 224, 44);
     		//frame.getContentPane().add(lblTypingBiubiubiu);
     		add(lblTypingBiubiubiu,gbc);
     		
     		gbc.insets = new Insets(5, 1, 1, 1);
     		gbc.gridx = 0;
    		gbc.gridy = 5;
     		JButton btnBack = new JButton("BACK");
    		btnBack.addActionListener(bbp);
    		btnBack.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_B, 0), "onB");
    		btnBack.getActionMap().put("onB", bbp);
    		btnBack.setBounds(323, 215, 97, 25);
    	//	frame.getContentPane().add(btnBack);
    		add(btnBack,gbc);
        }
    }

}


