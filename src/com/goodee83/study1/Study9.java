package com.goodee83.study1;

import java.util.Scanner;

public class Study9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		boolean login = false;
		// 로그인 검증
		// id=1234, pw=5678

		// 로그인 시도 전에 1. 로그인, 2. 종료
		// 사용자의 id와 pw를 입력 받아서 로그인을 N번 시도
		// 틀리면 로그인 실패 출력, 맞으면 로그인 성공 출력 후 종료

		// 반복문 종료 후 종료를 선택했다면 프로그램이 종료
		// 로그인이 성공 후 반복문이 종료 되었다면 게임을 시작하자

		// MMORPG :
		// 시작레벨은 1로 시작해서 15가 만렙
		// GOLD는 기본 0으로 시작.
		// 1 -> 2는 3마리, 2 -> 3은 6마리, 3 -> 4은 9마리
		// 14 -> 15는 42마리 사냥
		// 5레벨 달성시 1000G 지급
		// 10레벨 달성시 2000G 지급
		// 15레벨 달성시 3000G 지급

		// 15레벨 달성시 현재 레벨과 현재 골드를 출력후 시스템 종료

		while (true) {
			System.out.println("1. 로그인 | 2. 종료");
			int num = input.nextInt();
			if (num == 1) { // num이 1이면 로그인 창으로 넘어간다.
				System.out.println("아이디를 입력하세요 : ");
				int id2 = input.nextInt();
				System.out.println("패스워드를 입력하세요 : ");
				int pw2 = input.nextInt();
				if (id2 == id && pw2 == pw) {
					System.out.println("로그인에 성공하였습니다.");
					login = true;
					break;
				} else {
					System.out.println("로그인에 실패하였습니다.");
					continue;
				}

			} else if (num == 2) { // num이 2가 되면 프로그램을 종료한다.
				System.out.println("프로그램을 종료합니다.");
				break;
			} else { // 목록에 없는 번호를 입력시 알림을 띄우고 처음으로 되돌아간다.
				System.out.println("올바른 번호를 선택해 주세요.");
				continue;
			}

		}

		// 로그인 완료 후 게임 시작

		int level = 1;
		int gold = 0;

		if (login == true) {
			System.out.println("게임을 시작합니다.");
			System.out.println("현재 레벨은 1, 소지 GOLD는 0G입니다.");

			while (level < 15) { // level이 15에 도달하면 게임을 종료한다.
				System.out.println("1. 사냥 | 2. 게임 종료");
				int num2 = input.nextInt();
				if (num2 == 1) { // 메뉴에서 1번을 선택시 전투를 진행
					System.out.println("전투를 시작합니다.");

					// 몬스터 사냥 출력 코드

					int count = 1;
					for (int i = 0; i < level; i++) {
						for (int j = 0; j < 3; j++) {
							System.out.println("몬스터를 잡았습니다." + count + " 마리");
							count++;
						}
					}

					level++;

					// 레벨이 5단위로 오를 때 마다 골드를 지급해주는 코드

					if (level == 5) {
						System.out.println("축하합니다. 5레벨 달성 보상으로 1000gold가 지급됩니다.");
						gold = gold + 1000;
					} else if (level == 10) {
						System.out.println("축하합니다. 10레벨 달성 보상으로 2000gold가 지급됩니다.");
						gold = gold + 2000;
					} else if (level == 15) {
						System.out.println("축하합니다. 15레벨 달성 보상으로 3000gold가 지급됩니다.");
						gold = gold + 3000;
					}

					// 레벨업시 나오는 메세지 안내 코드

					System.out.println("레벨이 올랐습니다. 현재 레벨은" + level + ", 현재 GOLD는 " + gold + " 입니다.");
					if (level == 15) {
						System.out.println("최대 레벨에 도달하였습니다.");
					}

				} else if (num2 == 2) { // 메뉴에서 2번을 선택시 게임을 종료
					System.out.println("게임을 종료합니다.");
					break;
				} else { // 다른 선택지를 고를 시 메뉴 화면으로 돌아간다.
					System.out.println("올바른 선택지를 골라주세요.");
					continue;
				}
			}
		}
	}
}