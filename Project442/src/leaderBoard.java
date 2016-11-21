import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class leaderBoard extends JFrame {

    private static final long serialVersionUID = 1L;
   // private JFrame frame;
    public leaderBoard() {
        Box box = new Box(BoxLayout.Y_AXIS);
        box.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        box.add(Box.createVerticalGlue());
        leaderBoards leaderBoards_ = new leaderBoards();
        box.add(leaderBoards_);
        leaderBoards_.setLayout(null);
        
        JLabel lblTop = new JLabel("RANK");
        lblTop.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblTop.setBounds(35, 13, 59, 30);
        leaderBoards_.add(lblTop);
        
        JLabel lblNewLabel = new JLabel("1");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(35, 63, 20, 16);
        leaderBoards_.add(lblNewLabel);
        
        JLabel lblPlayer = new JLabel("PLAYER");
        lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPlayer.setBounds(150, 20, 75, 16);
        leaderBoards_.add(lblPlayer);
        
        JLabel lblScore = new JLabel("SCORE");
        lblScore.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblScore.setBounds(278, 20, 75, 16);
        leaderBoards_.add(lblScore);
        
        JLabel label = new JLabel("2");
        label.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label.setBounds(35, 92, 20, 16);
        leaderBoards_.add(label);
        
        JLabel label_1 = new JLabel("3");
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_1.setBounds(35, 121, 20, 16);
        leaderBoards_.add(label_1);
        
        JLabel label_2 = new JLabel("4");
        label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_2.setBounds(35, 150, 20, 16);
        leaderBoards_.add(label_2);
        
        JLabel label_3 = new JLabel("5");
        label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_3.setBounds(35, 179, 20, 16);
        leaderBoards_.add(label_3);
        
        JLabel label_4 = new JLabel("6");
        label_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_4.setBounds(35, 208, 20, 16);
        leaderBoards_.add(label_4);
        
        JLabel label_5 = new JLabel("7");
        label_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_5.setBounds(35, 237, 20, 16);
        leaderBoards_.add(label_5);
        
        JLabel label_6 = new JLabel("8");
        label_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_6.setBounds(35, 266, 20, 16);
        leaderBoards_.add(label_6);
        
        JLabel label_7 = new JLabel("9");
        label_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_7.setBounds(35, 295, 20, 16);
        leaderBoards_.add(label_7);
        
        JLabel label_8 = new JLabel("10");
        label_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_8.setBounds(35, 324, 32, 16);
        leaderBoards_.add(label_8);
        
        JLabel label_9 = new JLabel("-");
        label_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_9.setBounds(150, 66, 75, 16);
        leaderBoards_.add(label_9);
        
        JLabel label_10 = new JLabel("-");
        label_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_10.setBounds(150, 95, 75, 16);
        leaderBoards_.add(label_10);
        
        JLabel label_11 = new JLabel("-");
        label_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_11.setBounds(150, 124, 75, 16);
        leaderBoards_.add(label_11);
        
        JLabel label_12 = new JLabel("-");
        label_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_12.setBounds(150, 153, 75, 16);
        leaderBoards_.add(label_12);
        
        JLabel label_13 = new JLabel("-");
        label_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_13.setBounds(150, 182, 75, 16);
        leaderBoards_.add(label_13);
        
        JLabel label_14 = new JLabel("-");
        label_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_14.setBounds(150, 211, 75, 16);
        leaderBoards_.add(label_14);
        
        JLabel label_15 = new JLabel("-");
        label_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_15.setBounds(150, 240, 75, 16);
        leaderBoards_.add(label_15);
        
        JLabel label_16 = new JLabel("-");
        label_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_16.setBounds(150, 269, 75, 16);
        leaderBoards_.add(label_16);
        
        JLabel label_17 = new JLabel("-");
        label_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_17.setBounds(150, 298, 75, 16);
        leaderBoards_.add(label_17);
        
        JLabel label_18 = new JLabel("-");
        label_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_18.setBounds(150, 327, 75, 16);
        leaderBoards_.add(label_18);
        
        JLabel label_19 = new JLabel("-");
        label_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_19.setBounds(278, 66, 75, 16);
        leaderBoards_.add(label_19);
        
        JLabel label_20 = new JLabel("-");
        label_20.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_20.setBounds(278, 95, 75, 16);
        leaderBoards_.add(label_20);
        
        JLabel label_21 = new JLabel("-");
        label_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_21.setBounds(278, 124, 75, 16);
        leaderBoards_.add(label_21);
        
        JLabel label_22 = new JLabel("-");
        label_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_22.setBounds(278, 153, 75, 16);
        leaderBoards_.add(label_22);
        
        JLabel label_23 = new JLabel("-");
        label_23.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_23.setBounds(278, 182, 75, 16);
        leaderBoards_.add(label_23);
        
        JLabel label_24 = new JLabel("-");
        label_24.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_24.setBounds(278, 211, 75, 16);
        leaderBoards_.add(label_24);
        
        JLabel label_25 = new JLabel("-");
        label_25.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_25.setBounds(278, 240, 75, 16);
        leaderBoards_.add(label_25);
        
        JLabel label_26 = new JLabel("-");
        label_26.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_26.setBounds(278, 269, 75, 16);
        leaderBoards_.add(label_26);
        
        JLabel label_27 = new JLabel("-");
        label_27.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_27.setBounds(278, 298, 75, 16);
        leaderBoards_.add(label_27);
        
        JLabel label_28 = new JLabel("-");
        label_28.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label_28.setBounds(278, 327, 75, 16);
        leaderBoards_.add(label_28);
        
        JButton btnBack = new JButton("BACK");
        btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        	}
        });
        btnBack.setBounds(278, 362, 97, 25);
        leaderBoards_.add(btnBack);
        box.add(Box.createVerticalGlue());
        getContentPane().add(box);
        pack();
        setTitle("LEADERBOARD");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMaximumSize(getMinimumSize());
        setMinimumSize(getMinimumSize());
        setPreferredSize(getPreferredSize());
        setLocation(150, 150);
        setVisible(true);
    }

    public static void newLeaderBoard() {
        Runnable r = new Runnable() {

            @Override
            public void run() {
            	leaderBoard main = new leaderBoard();
            }
        };
        javax.swing.SwingUtilities.invokeLater(r);
    }
}

class leaderBoards extends JPanel {

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
    
    public leaderBoards(){
    	super();
    	int margin = 0;
    	//this.setBackground(Color.BLUE);
    	Dimension dim = getSize();
    	
    	this.setBounds(margin, margin, dim.width - margin * 2, dim.height - margin * 2);
	
    	
    	
}
}
