package a13_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server {

	public void start() {
		
		int port = 8500;
		
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		
		InputStream is = null;
		OutputStream os = null;
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			
			InetAddress inet = InetAddress.getLocalHost();
			
			System.out.println("서버 IP 주소 : " +inet.getHostAddress());
			
			System.out.println("server 입니다");
			System.out.println("클라이언트의 접속을 기다리고 있습니다.");
			
			clientSocket = serverSocket.accept();
			
			System.out.println("클라이언트 접속 성공");
			
			is = clientSocket.getInputStream();
			os = clientSocket.getOutputStream();
			
			br = new BufferedReader ( new InputStreamReader (is));
			
			pw = new PrintWriter(os);
			
			
			
			
		} catch (Exception e) {

		}
			

			
			
		
	
		
		
		
		
		
		
		
		
		
		
		
}
}