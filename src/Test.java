import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class Test {
    private JFrame frame = new JFrame();
    private JLayeredPane lpane = new JLayeredPane();
    private JPanel panelBlue = new JPanel();
    private JPanel panelGreen = new JPanel();
    
    private JLabel bgImageLabel = new JLabel();
    private JLabel gameBoardLabel = new JLabel();
    
    public Test()
    {
    	
    	
    	bgImageLabel.setIcon(new ImageIcon("src/img/menuBG.png"));
    	gameBoardLabel.setText("HERE IS A BUNCH OF TEXT THAT WILL SHOW UP");
    	
        frame.setPreferredSize(new Dimension(600, 400));
        frame.setLayout(new BorderLayout());
        frame.add(lpane, BorderLayout.CENTER);
        lpane.setBounds(0, 0, 600, 400);
     
       // panelBlue.setBackground(Color.BLUE);
        panelBlue.setBounds(0, 0, 600, 400);
        panelBlue.setOpaque(true);
        panelBlue.add(bgImageLabel);
        
        //panelGreen.setBackground(Color.GREEN);
        panelGreen.setBounds(100, 100, 400, 100);
        panelGreen.setOpaque(false);
        panelGreen.add(gameBoardLabel);
       
        lpane.add(panelBlue, new Integer(0), 0);
        lpane.add(panelGreen, new Integer(1), 0);
        frame.pack();
        
        
        
        frame.setVisible(true);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Test();
    }

}