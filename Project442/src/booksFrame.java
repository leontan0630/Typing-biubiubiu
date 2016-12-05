import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class booksFrame extends JFrame {
	private JLabel lblNewLabel;
	private ImageIcon image;
	private ImageIcon newImage;
    private static final long serialVersionUID = 1L;
   // private JFrame frame;
    public booksFrame() {
        Box box = new Box(BoxLayout.Y_AXIS);
        box.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        box.add(Box.createVerticalGlue());
        booksFrames leaderBoards_ = new booksFrames();
        box.add(leaderBoards_);
        leaderBoards_.setLayout(null);
        
       
        try {
            //setIcon(new ImageIcon(ImageIO.read(new File("things/bright-colored-backgrounds-1455249.jpg"))));
        	image=new ImageIcon(ImageIO.read(ResourceLoader.load("pg21650.cover.medium.jpg")));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //image = new ImageIcon("things/pg21650.cover.medium.jpg");
        //image = new ImageIcon(ImageIO.read(ResourceLoader.load("bright-colored-backgrounds-1455249.jpg")));
        lblNewLabel = new JLabel(image);
        lblNewLabel.setBounds(10, 34, 189, 244);
        leaderBoards_.add(lblNewLabel);
        
        
     
        JButton btnConfirm = new JButton("CONFIRM");
        btnConfirm.setBounds(56, 318, 97, 25);
        leaderBoards_.add(btnConfirm);
        btnConfirm.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				chapterSelection n = new chapterSelection();
				n.newChapter();
			}
        	
        });
        try {
            //setIcon(new ImageIcon(ImageIO.read(new File("things/bright-colored-backgrounds-1455249.jpg"))));
        	newImage=new ImageIcon(ImageIO.read(ResourceLoader.load("pg13213.cover.medium.jpg")));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //ImageIcon newImage = new ImageIcon("things/pg13213.cover.medium.jpg");
        JLabel lblNewLabel_1=new JLabel(newImage);
        
        lblNewLabel_1.setBounds(209, 34, 181, 244);
        leaderBoards_.add(lblNewLabel_1);
        
        JButton btnConfirm_1 = new JButton("CONFIRM");
        btnConfirm_1.setBounds(253, 319, 89, 23);
        leaderBoards_.add(btnConfirm_1);
        btnConfirm_1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				chapterSelection1 n = new chapterSelection1();
				n.newChapter1();
			}
        	
        });
        
        
        
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
