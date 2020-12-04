package pack1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(7777); 	//port
			System.out.println("서버가 준비되었습니다.");
			socket = serverSocket.accept();			// client가 접속할때까지 대기
			System.out.println("클라이언트와 연결되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if(socket!=null) try {socket.close();} catch(IOException e) {}
			if(serverSocket!=null) try {serverSocket.close();} catch(IOException e) {}
		}
		System.out.println("끝");
	}

}
