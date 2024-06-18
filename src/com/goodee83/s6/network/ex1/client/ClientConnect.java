package com.goodee83.s6.network.ex1.client;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientConnect {
	
	private Socket socket;
	private InputStream is;
	private InputStreamReader ir;
	private BufferedReader br;
	private OutputStream os;
	private OutputStreamWriter ow;
	
	
	
	public BufferedReader getBr() {
		return br;
	}

	public OutputStreamWriter getOw() {
		return ow;
	}
	
	// 1. 연결 메서드
	public void getConnetion() throws Exception{
		socket = new Socket("localhost", 8282);
		
		// input
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		
		
		// out put
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);
	}
	
	// 2. 해제 메서드	
	public void disConnect() throws Exception{
		br.close();
		ir.close();
		is.close();
		
		ow.close();
		os.close();
		socket.close();
	}
	
	

}
