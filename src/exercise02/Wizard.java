package exercise02;

public class Wizard {
	String name;
	int hp;
	int mp;
	int power;

	public Wizard(int hp, int mp, int pow, String name) {
		this.hp = hp;
		this.mp = mp;
		this.power = pow;
		this.name = name;
	}

	public void attack() {
		System.out.println(this.name + "は呪文を唱えた！");
		System.out.println(this.power + "のダメージ！");
	}

	public void sleep() {
		System.out.println(this.name + "はあまり眠れなかった");
	}

	public void showStatus() {
		System.out.println("[" + this.name + "のステータス]--------------------");
		System.out.println("HP: " + this.hp);
		System.out.println("MP: " + this.mp);
		System.out.println("魔力: " + this.power);
	}
}
