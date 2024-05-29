package com.goodee83.study3.ex1;

public class MonsterMain {
	public static void main(String[] args) {
		
		Monster monster = new Monster();
		Monster monster2 = new Monster();
		
		monster.name = "redDragon";
		monster.tri = "dragon";
		monster.level = 99;
		monster.hp = 9999;
		monster.exp = 10000;
		
		
		System.out.println("이름 : " + monster.name);
		System.out.println("종족 : " + monster.tri);
		System.out.println("레벨 : " + monster.level);
		System.out.println("체력 : " + monster.hp);
		System.out.println("경험치 : " + monster.exp);
		
		Weapon weapon = new Weapon();
		weapon.name = "ax";
		weapon.damage = 10;
		weapon.range = 1;
		weapon.durability = 100;
		weapon.upgrade = 8;
		
		monster.weapon = weapon;
		System.out.println(monster.weapon.name);
		
		weapon = new Weapon();
		weapon.name = "sword";
		
		System.out.println(monster.weapon.name);
		
		monster2.weapon = weapon;
		System.out.println(monster2.weapon.name);
	}

}
