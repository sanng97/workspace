package a13_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public void start() {
	
		String ip = "127.0.0.1"; //  현재 컴퓨터를 나타내는  ip주소
		
		int port = 8500; // 서버에서 지정한 포트번호
		
		Socket socket = null;  // 클라이언트 - 서버연결
		
		InputStream is = null;
		OutputStream os = null;
		
		// 성능 향상용 보조 스트림
		BufferedReader br = null;
		PrintWriter pw = null;
		
		   try { 
			   
			System.out.println("client 입니다.");
			
			socket = new Socket(ip, port);
			
			if(socket != null) {
				
				
				// 서버와 입출력 스트림 생성
				is = socket.getInputStream();
				os = socket.getOutputStream();
				
				// 보조스트림을 이용해 성능개선
				br = new BufferedReader( new InputStreamReader(is));
				pw = new PrintWriter(os);
				
				// 클라이언트 -> 서버로 입력하는 메시지 출력
				Scanner sc = new Scanner(System.in);
				String clientMessage = sc.nextLine();
				
			     System.out.println("서버로 전달할 메시지 : ");
			     String ClientMessage = sc.nextLine();
			     
			     pw.println(clientMessage); // 서버로 메시지 출력
			     pw.flush(); //스트림에 있는 메시지 밀어내기
	
			}
	
		} catch (Exception e) {
			 e.printStackTrace();
			 
			// 메모리 누수 관리 
		}finally {
			try {
				
				if (br != null) br.close();
				if (pw != null) pw.close();
			}catch (IOException e){
				e.printStackTrace();

		}

	}

}
}