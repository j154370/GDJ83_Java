package com.goodee83.study3.ex1;

public class GameController {

	public void start() {
		MonsterFactory mf = new MonsterFactory();

		Monster monster = mf.createMonster();

		System.out.println(monster.name);
		System.out.println(monster.level);

		Monster[] monsters = mf.createMonsterGroup();

		for (int i = 0; i < monsters.length; i++) {
			System.out.println("==========================");
			System.out.println(monsters[i].name);
			System.out.println(monsters[i].level);

		}
	}

}
