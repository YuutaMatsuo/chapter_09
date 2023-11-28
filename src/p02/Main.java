package p02;
public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		Sword sword = new Sword();
		
//		sword.name = "炎の剣";
//		sword.damage = 100;
		
		h.name = "みなと";
		h.hp = 100;
//		h.s = sword;
		//Heroインスタンスの「h」のフィールド「s」に対して
		//Swordインスタンス「sword」を代入している（ここで勇者が剣を装備したこととなる）
		
		System.out.println(h.name + "が持っている武器は...");
		System.out.println(sword.name + "です");
//		System.out.println(h.s.name + "です");
		
		h.attack();
	}
}
