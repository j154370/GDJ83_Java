package com.goodee83.s6.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) {
		// Network
		// ip:port -> Socket
		// network 통신은 소켓끼리 1대1 통신
		
		Scanner sc = new Scanner(System.in);
		ServerSocket ss = null;
		Socket socket = null;
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		boolean flag = true;
		
		try {
			ss = new ServerSocket(8282);
			// 서버를 열고 클라이언트 접속을 기다리는 중
			System.out.println("서버 실행 후 클라이언트 대기");
			socket = ss.accept();
			System.out.println("클라이언트와 연결 성공");
			
			while(flag) {
				
				is = socket.getInputStream();
				isr = new InputStreamReader(is);
				br = new BufferedReader(isr);
				
				String msg = br.readLine();
				if(msg.equals("exit")) {
					System.out.println("강제 종료합니다.");
					flag = false;
					break;
				}
				
				System.out.println(msg);
				System.out.println("클라이언트로 보낼 메세지 입력");
				String s = sc.next();
				
				os = socket.getOutputStream();
				osw = new OutputStreamWriter(os);
				osw.write(s + "\r\n");
				osw.flush();
				
				if(s.equals("exit")) {
					System.out.println("강제 종료합니다.");
					flag = false;
					break;
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				osw.close();
				os.close();
				br.close();
				isr.close();
				is.close();
				socket.close();
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
