package com.goodee83.s6.network.ex1.client;

public class ClientMain {

	public static void main(String[] args) {
		ClientConnect clientConnect = new ClientConnect();
		ClientService clientService = new ClientService();
		try {
			clientConnect.getConnetion();
			clientService.getInfo(null);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
