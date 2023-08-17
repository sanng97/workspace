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
		
//		1. 서버 포트번호 정하기
		int port = 8500;
		
//     2. 서버용 소켓 객체 생성
        ServerSocket serverSocket = null;// 클라이언트 -> 서버스트림
        Socket clientSocket =null;// 클라이언트 <- 서버스트림
        
        
        InputStream is = null;
        OutputStream os = null;
		
		    // 성능 향상을 위한 보조 스트림
		    BufferedReader br = null;
		    PrintWriter pw = null;
		
		    try {
					// 서버 컴퓨터 ( 내 컴퓨터)의 ip 관련 정보를 얻어옴
		   InetAddress inet = InetAddress.getLocalHost() 	;
		   System.out.println("서버 ip 주소 : " + inet.getHostAddress()); 	
		   
		   //3.  클라이언트가 연결되길 기다린다
		   serverSocket = new ServerSocket(port);
		   
		   System.out.println("server 입니다");
		   System.out.println("클라이언트의 접속을 기다리고 있습니다.");
		   
		   // 4. 접속요청이 오면 해당 클라이언트에 대한 소켓 객체 생성
		   clientSocket = serverSocket.accept(); // accept 허용하다
		   System.out.println("클라이언트 접속 성공");
		    
		   // 5. 연결된 클라이언트와 입출력 스트림 생성
		   
		   is = clientSocket.getInputStream(); // 클라이언트 -> 서버 입력
		   os = clientSocket.getOutputStream();// 서버 -> 클라이언트 출력
		   
		   
		   // 6. 보조 스트림을 통해 성능 개선
		   br = new BufferedReader  (new InputStreamReader(is));
		   pw = new PrintWriter(os);
		   
		   // 7. 스트림을 통해서 읽고 쓰기
		   // 7.1) 서버 -> 클라이언트 메시지 전달
		   
		   Date now = new Date(); 
		   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				 
		   String message = sdf.format(now)+ "서버접속성공";
		   
		   pw.println(message);
		   pw.flush(); // 스트림 (버퍼)에 기록된 내용을 밀어내는 코드 
		                      // ->미작성 시 클라이언트 쪽으로 출력되지 않아
		   
		   // 7-2) 서버 <- 클라이언트 메시지 받기 (입력)
		   
		   String clientMessage = br.readLine(); // 한줄읽기
		   
		   // 클라이언트 IP주소
		   String clientIP = clientSocket.getInetAddress().getHostAddress();
		   System.out.println("클라이언트로 부터 받은 메시지" + clientMessage);
		   
		   
			} catch (Exception e) {
				e.printStackTrace();
				
			}finally { // try 구문에서 예외 발생 여부 관계 없이 무조건 수행
				          // 메모리 누수 관리
				          // 같이 close()된다.
				
				try {
					
					
					if(br != null) br.close();
					if(pw!=null) pw.close();
					
					if( serverSocket != null)  serverSocket.close();
					if (clientSocket != null)   clientSocket.close();
					
				}catch ( IOException e) {
					
					e.printStackTrace();

				}
				
				
				
				
				
				
				
				
			}
		
	
		
		
		
	}

	
	
	
	
	
	
	
	
}
