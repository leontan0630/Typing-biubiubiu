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

public class chapterSelection {
	private JFrame frame;
    public static void newChapter()  {
        //new chapterSelection();
    }

    public chapterSelection() {
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
                setIcon(new ImageIcon(ImageIO.read(new File("bright-colored-backgrounds-1455249.jpg"))));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.anchor = GridBagConstraints.CENTER;
            gbc.insets = new Insets(2, 2, 20, 2);
            
            JLabel lblChapter = new JLabel("CHAPTER SELECTION:");
    		lblChapter.setFont(new Font("Tahoma", Font.PLAIN, 17));
    		lblChapter.setForeground(Color.ORANGE);
    		lblChapter.setBounds(118, 11, 188, 37);
    		gbc.gridx = 0;
    		gbc.gridy = 0;
    		add(lblChapter,gbc);
    		
    		
    		gbc.insets = new Insets(2, 2, 10, 2);
		            
    		JButton btnNewButton = new JButton("THE ADVENTURES OF KINTARO, THE GOLDEN BOY");
    		
    		btnNewButton.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				try {
    					PrintWriter writer = new PrintWriter("the-chapter.txt","UTF-8");
    					writer.println("THE ADVENTURES OF KINTARO, THE GOLDEN BOY");
    					writer.close();
    				} catch (FileNotFoundException e1) {
    					// TODO Auto-generated catch block
    					e1.printStackTrace();
    				} catch (UnsupportedEncodingException e1) {
    					// TODO Auto-generated catch block
    					e1.printStackTrace();
    				} 
    				frame.dispose();
    				newFrame n = new newFrame();
    				n.newWindow();
    			}
    		});
    		
    		
    		gbc.gridx = 0;
    		gbc.gridy = 1;
    		add(btnNewButton,gbc);
   		
    		JButton btnNewButton_1 = new JButton("   THE BAMBOO-CUTTER AND THE MOON-CHILD    ");
    		
    		btnNewButton_1.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				try {
    					PrintWriter writer = new PrintWriter("the-chapter.txt","UTF-8");
    					writer.println("THE BAMBOO-CUTTER AND THE MOON-CHILD");
    					writer.close();
    				} catch (FileNotFoundException e1) {
    					// TODO Auto-generated catch block
    					e1.printStackTrace();
    				} catch (UnsupportedEncodingException e1) {
    					// TODO Auto-generated catch block
    					e1.printStackTrace();
    				} 
    				frame.dispose();
    				newFrame n = new newFrame();
    				n.newWindow();
    			}
    		});
    		gbc.gridx = 0;
    		gbc.gridy = 2;
    		add(btnNewButton_1,gbc);
    		//btnNewButton_1.setBounds(51, 145, 308, 25);
    		//add(btnNewButton_1);
    		
    		
    		JButton btnNewButton_2 = new JButton("THE STORY OF URASHIMA TARO, THE FISHER LAD");
    		btnNewButton_2.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				try {
    					PrintWriter writer = new PrintWriter("the-chapter.txt","UTF-8");
    					writer.println("THE STORY OF URASHIMA TARO, THE FISHER LAD");
    					writer.close();
    				} catch (FileNotFoundException e1) {
    					// TODO Auto-generated catch block
    					e1.printStackTrace();
    				} catch (UnsupportedEncodingException e1) {
    					// TODO Auto-generated catch block
    					e1.printStackTrace();
    				} 
    				frame.dispose();
    				newFrame n = new newFrame();
    				n.newWindow();
    			}
    		});
    		
    		gbc.gridx = 0;
    		gbc.gridy = 3;
    		add(btnNewButton_2,gbc);
    		
    		
    		AbstractAction mbp = new AbstractAction(){
    			public void actionPerformed(ActionEvent e) {
    				frame.dispose();
    				booksFrame n = new booksFrame();
    				n.booksFrame();
    			}
    		};
    		JButton btnNewButton_3 = new JButton("BACK");
    		btnNewButton_3.addActionListener(mbp);
    		btnNewButton_3.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_B, 0), "onB");
    		btnNewButton_3.getActionMap().put("onB", mbp);
    		btnNewButton_3.setForeground(Color.BLACK);
    		btnNewButton_3.setBackground(Color.WHITE);
    		//btnNewButton_3.setSize( 105, 25);
    		gbc.gridx = 0;
    		gbc.gridy = 4;
    		add(btnNewButton_3,gbc);
        }
    }

}

