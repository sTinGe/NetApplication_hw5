package tic_tac_toe;
import java.net.InetSocketAddress;/* Socket */
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.BufferedOutputStream;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
 
public class start extends JFrame {
 
	JPanel contentPane;
	main game;
	client client_addr;
	
	public static void main(String[] args) {
		start frame = new start();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					start frame = new start();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 
	/**
	 * Create the frame.
	 */
	public start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
 
		JLabel prompt = new JLabel("歡迎來到\"tic-tac-toe\"");
		prompt.setBounds(0, 107, 110, 14);
		contentPane.add(prompt,BorderLayout.WEST);
		
		final JTextField field = new JTextField(10);
		field.setText("請輸入您的ID");
		field.selectAll();
		contentPane.add(field, BorderLayout.EAST);
		
		JButton btnView = new JButton("進入遊戲");
		btnView.setBounds(168, 161, 89, 23);
		contentPane.add(btnView, BorderLayout.SOUTH);
		
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ID = field.getText();
				if( ID.equals("請輸入您的ID") == false ){
					String test = null;
					/* Create Socket*/
					try {
						client_addr = new client( ID );
					} catch (UnknownHostException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					contentPane.removeAll();
					contentPane.invalidate();
					setBounds(100, 100, 1024, 768);
					
					game = new main();
					game.IDtransfer( test );
					game.contentPane.setVisible(true);
					contentPane.add(game.contentPane);
					((JPanel) contentPane).revalidate();
					contentPane.repaint();
					
					System.out.println("你已成功進入");
					
					
					
				}
				else{
					error err = new error();
				}
			}
		});
	}
}

