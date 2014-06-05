package tic_tac_toe;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
 
public class client implements Runnable{
    
	private String host = "localhost";// 連線的ip
  private int port = 8765;// 連線的port
  private static Socket client = null;
  private int win;
  private int lose;
  private String ID;
  private String vID;
  
  public client( String name ) throws UnknownHostException, IOException{
  	ID = name;
  	win = 0;
  	lose = 0;
  	new Socket(host,port);
  }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}