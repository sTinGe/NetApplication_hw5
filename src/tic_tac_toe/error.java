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

			//容器 
			Container pn = getContentPane(); 
			//設定成FlowLayout
			FlowLayout fy = new FlowLayout();
			pn.setLayout(fy); 
			
			//建立JLabel 
			JLabel l1 = new JLabel("<html>你尚未輸入ID<br>輸入錯誤!<br>程式即將關閉.....</html>"); 
			pn.add(l1); 
			
			setContentPane(pn); 
    } 
}