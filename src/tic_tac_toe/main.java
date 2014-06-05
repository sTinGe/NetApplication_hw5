package tic_tac_toe;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
 
public class main extends JFrame {
 
	JPanel contentPane;
	public String user;
	public int win;
	public int lose;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.win = 0;
					frame.lose = 0;
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
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
 
	}

	public void IDtransfer( String a ) {
		// TODO Auto-generated method stub
		user = a;
		JLabel lblThisIsView = new JLabel( "Your ID is " + a );
		lblThisIsView.setBounds(178, 107, 110, 14);
		contentPane.add(lblThisIsView,BorderLayout.CENTER);
	}
}