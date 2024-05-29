package com.goodee83.study3.ex1;

import java.util.Random;

public class MonsterFactory {

	public Monster createMonster() {
		Monster monster = new Monster();

		return monster;
	}

	public Monster[] createMonsterGroup() {
		Random random = new Random();
		int count = random.nextInt(5) + 2;
		Monster[] monsters = new Monster[count];
		
		
		for (int i = 0; i < count; i++) {
			monsters[i] = new Monster();
		}
		
		return monsters;
	}

}
