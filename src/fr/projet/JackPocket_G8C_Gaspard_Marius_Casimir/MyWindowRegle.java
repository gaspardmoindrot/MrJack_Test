package fr.projet.JackPocket_G8C_Gaspard_Marius_Casimir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class MyWindowRegle extends JFrame implements ActionListener {

    private static final long serialVersionUID = -4939544011287453046L;
    public JLayeredPane layeredPane;
    public JLabel LFond;
    public JLabel LRegle;
    public JButton BCroix;
    
    public MyWindowRegle() {
    	
    	layeredPane = new JLayeredPane();
    	layeredPane.setBounds(0, 0, 840, 800);
    	
    	this.setTitle("MrJackAndPocket");
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setResizable(false);
    	this.setSize(840, 800);
    	this.setLocationRelativeTo(null);

    	LFond = new JLabel();
    	LFond.setIcon(new ImageIcon(MyWindowBase.class.getResource("/Image_MrJack2/ArrierePlan.png")));
    	LFond.setBounds(0, 0, 840, 800);
    	
    	LRegle = new JLabel();
    	LRegle.setIcon(new ImageIcon(MyWindowBase.class.getResource("/Image_MrJack2/Regle.png")));
    	LRegle.setBounds(50, 20, 740, 670);
        
        BCroix = new JButton();
        BCroix.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/Croix.png")));
        BCroix.setBounds(750, 690, 80, 80);
        BCroix.addActionListener((ActionListener) this);
        
        layeredPane.add(BCroix);
        layeredPane.add(LRegle);
    	layeredPane.add(LFond, Integer.valueOf(-1));
    	this.add(layeredPane);

    }
    
    @Override
    public void actionPerformed( ActionEvent event) {
    	if (event.getSource() == BCroix) {
    		this.dispose();
    		MyWindowBase myWindowBase = new MyWindowBase();
    		myWindowBase.setVisible(true);
    	}
    }
}