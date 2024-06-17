package com.goodee83.s6.network;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain2 {

	public static void main(String[] args) {
		// Network
		// ip:port -> Socket
		// network 통신은 소켓끼리 1대1 통신

		Scanner sc = new Scanner(System.in);
		ServerSocket serviceSocket = null;
		Socket socket = null;
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		boolean flag = true;
		File file = new File("C:\\Study", "student.txt");
		FileReader fr = null;

		try {
			serviceSocket = new ServerSocket(8282);
			// 서버를 열고 클라이언트 접속을 기다리는 중

			while (true) {

				System.out.println("서버 실행 후 클라이언트 대기");
				socket = serviceSocket.accept();
				System.out.println("클라이언트와 연결 성공");

				while (flag) {

					is = socket.getInputStream();
					isr = new InputStreamReader(is);
					br = new BufferedReader(isr);

					String menu = br.readLine();
					System.out.println(menu);

					if (menu.equals("1")) {
						os = socket.getOutputStream();
						osw = new OutputStreamWriter(os);

						fr = new FileReader(file);
						br = new BufferedReader(fr);
						StringBuffer sb = new StringBuffer();
						while (true) {
							String s = br.readLine();
							if (s == null) {
								break;
							}
							sb.append(s);
							sb.append(",");

						}
						String s = sb.toString();

						osw.write(s + "\r\n");
						osw.flush();

					} else if (menu.equals("2")) {
						String msg = "검색하고자 하는 학생 번호를 입력하세요";

						os = socket.getOutputStream();
						osw = new OutputStreamWriter(os);
						osw.write(msg + "\r\n");
						osw.flush();

						is = socket.getInputStream();
						isr = new InputStreamReader(is);
						br = new BufferedReader(isr);

						String menu2 = br.readLine();
						System.out.println(menu2);

						fr = new FileReader(file);
						br = new BufferedReader(fr);

						while (true) {
							String s = br.readLine();
							if (s == null) {
								break;
							}
							String[] ss = s.split(",");
							if(ss[0].trim().equals(menu2)) {
								osw.write(s + "\r\n");
								osw.flush();
								break;
							}

						}

					} else if (menu.equals("3")) {
						System.out.println("강제 종료합니다.");
						flag = false;
					}

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
				serviceSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}