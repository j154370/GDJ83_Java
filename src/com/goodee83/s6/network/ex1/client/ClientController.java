package com.goodee83.s6.network.ex1.client;

import java.util.Scanner;

public class ClientController {
	
	private ClientConnect clientConnect;
	private ClientService clientService;
	
	public ClientController() {
		clientConnect = new ClientConnect();
		clientService = new ClientService();
	}

	public void start() throws Exception{
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		clientConnect.getConnetion();

		while (flag) {
			System.out.println("1. 전체 정보 출력 | 2. 상세 정보 출력 | 3. 프로그램 종료");
			int select = sc.nextInt();
			
			if(select==1) {
				clientConnect.getOw().write(select + "\r\n");
				clientConnect.getOw().flush();
				
				String info = clientConnect.getBr().readLine();
				
				clientService.getInfo(info);
				
			}else if(select==2) {
				
			}else {
				
			}
		}
	}

}
