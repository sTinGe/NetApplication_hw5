package tic_tac_toe;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

class error extends JFrame//Error Frame
{ 
    public error() 
    { 
    	super("Error"); 
    	setSize(250,100); 
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
			setVisible(true); 

			//�e�� 
			Container pn = getContentPane(); 
			//�]�w��FlowLayout
			FlowLayout fy = new FlowLayout();
			pn.setLayout(fy); 
			
			//�إ�JLabel 
			JLabel l1 = new JLabel("<html>�A�|����JID<br>��J���~!<br>�{���Y�N����.....</html>"); 
			pn.add(l1); 
			
			setContentPane(pn); 
    } 
}