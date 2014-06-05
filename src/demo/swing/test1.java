package demo.swing;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; //事件
public class test1
{ 
    public static void main(String args[]) 
    { 
    win1 bb = new win1(); 
    } 
} 


class win1 extends JFrame//父視窗
{ 
    public win1() 
    { 
super("win"); 
setSize(250,200); 
setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
setVisible(true); 


//容器 
Container pn = getContentPane(); 
//設定成FlowLayout
FlowLayout fy = new FlowLayout();
pn.setLayout(fy); 


//建立button
JButton bt1 = new JButton("enter"); 
pn.add(bt1); 



//bt1事件的動作
bt1.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e) 
{ 
win2 cc = new win2();  //開啟視窗
} 
}); 

setContentPane(pn); 
    } 
    

}






public class win2 extends JFrame//子視窗
{ 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public win2() 
    { 
super("win2"); 
setSize(250,200); 
setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
setVisible(true); 


//容器 
Container pn = getContentPane(); 
//設定成FlowLayout
FlowLayout fy = new FlowLayout();
pn.setLayout(fy); 


//建立JLabel 
JLabel l1 = new JLabel("HI"); 
pn.add(l1); 

setContentPane(pn); 
    } 
    

}