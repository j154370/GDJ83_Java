package com.goodee83.s6.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;


public class ClientMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		boolean flag = true;
		
		try {
			socket = new Socket("192.168.7.114", 8282);
			System.out.println("서버와 연결 성공");
			
			while(flag) {		
				
				System.out.println("서버로 보낼 메세지 입력");
				String msg = sc.next();
				
				os = socket.getOutputStream();
				osw = new OutputStreamWriter(os);
				osw.write(msg + "\r\n");
				osw.flush();
				
				if(msg.equals("exit")) {
					System.out.println("강제 종료합니다.");
					flag = false;
					break;
				}
				
				is = socket.getInputStream();
				isr = new InputStreamReader(is);
				br = new BufferedReader(isr);
				
				String s = br.readLine();
				if(s.equals("exit")) {
					System.out.println("강제 종료합니다.");
					flag = false;
					break;
				}
				
				System.out.println(s);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
				is.close();
				osw.close();
				os.close();
				socket.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
