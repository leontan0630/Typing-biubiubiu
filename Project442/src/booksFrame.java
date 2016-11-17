import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class booksFrame extends JFrame {
	private JLabel lblNewLabel;
	private ImageIcon image;
    private static final long serialVersionUID = 1L;
   // private JFrame frame;
    public booksFrame() {
    	
    	
        Box box = new Box(BoxLayout.Y_AXIS);
        box.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        box.add(Box.createVerticalGlue());
        booksFrames leaderBoards_ = new booksFrames();
        box.add(leaderBoards_);
        leaderBoards_.setLayout(null);
        
        
        
        
        
        
        
        
        image = new ImageIcon("japanese-fairy-tales-2.gif");
        lblNewLabel = new JLabel(image);
        lblNewLabel.setBounds(105, 34, 189, 244);
	//	JLabel lblNewLabel = new JLabel(image);
        leaderBoards_.add(lblNewLabel);
        
        
        AbstractAction mbp = new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				chapterSelection n = new chapterSelection();
				n.newChapter();
			}
		};
        JButton btnConfirm = new JButton("CONFIRM");
        btnConfirm.addActionListener(mbp);
        btnConfirm.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "onENTER");
		btnConfirm.getActionMap().put("onENTER", mbp);
        btnConfirm.setBounds(143, 326, 97, 25);
        leaderBoards_.add(btnConfirm);
        
        
        AbstractAction lbp = new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
			 image = new ImageIcon("pg13213.cover.medium.jpg");
		      
			 lblNewLabel = new JLabel(image);
			 lblNewLabel.setBounds(105, 34, 189, 244);
			 leaderBoards_.add(lblNewLabel);
			
			}
		};
        JButton button = new JButton("<<");
        button.addActionListener(lbp);
        button.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), "onLEFT");
		button.getActionMap().put("onLEFT", lbp);
        button.setBounds(34, 326, 97, 25);
        leaderBoards_.add(button);
        
        JButton btnNewButton = new JButton(">>");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton.setBounds(252, 326, 97, 25);
        leaderBoards_.add(btnNewButton);
        
        
        
       
        box.add(Box.createVerticalGlue());
        getContentPane().add(box);
        pack();
        setTitle("BOOKS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMaximumSize(getMinimumSize());
        setMinimumSize(getMinimumSize());
        setPreferredSize(getPreferredSize());
        setLocation(150, 150);
        setVisible(true);
    }

    public static void booksFrame() {
        Runnable r = new Runnable() {

            @Override
            public void run() {
            	//booksFrame main = new booksFrame();
            	//main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        };
        javax.swing.SwingUtilities.invokeLater(r);
    }
}

class booksFrames extends JPanel {
	

    private static final long serialVersionUID = 1L;

    @Override
    public Dimension getMinimumSize() {
        return new Dimension(400, 400);
    }

    @Override
    public Dimension getMaximumSize() {
        return new Dimension(400, 400);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }

   /* @Override
    public void paintComponent(Graphics g) {
        int margin = 10;
        Dimension dim = getSize();
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(margin, margin, dim.width - margin * 2, dim.height - margin * 2);
    }*/
    
    public booksFrames(){
    	super();
    	int margin = 0;
    	//this.setBackground(Color.BLUE);
    	Dimension dim = getSize();
    	
    	this.setBounds(margin, margin, dim.width - margin * 2, dim.height - margin * 2);
	
    	
    	
}
}
