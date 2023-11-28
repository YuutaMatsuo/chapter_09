package exercise02;

/**
 * 「勇者」クラス
 */
public class Hero {
	String name;
	int hp;
	int mp;
	int power;

	public Hero(int hp, int mp, int pow, String name) {
		this.hp = hp;
		this.mp = mp;
		this.power = pow;
		this.name = name;
	}

	public Hero(int hp, int mp, int pow) {
		this(hp, mp, pow, "ユウシャ");
	}

	public Hero(int hp, int mp) {
		this(hp, mp, 20);
	}

	public Hero(int hp) {
		this(hp, 10);
	}

	public Hero(String name) {
		this(30, 50, 5, name);
	}

	public Hero() {
	}

	public void attack() {
		System.out.println(this.name + "の攻撃！");
		System.out.println(this.power + "のダメージ！");
	}

	public void sleep() {
		System.out.println(this.name + "はぐっすり眠った");
	}

	public void showStatus() {
		System.out.println("[" + this.name + "のステータス]--------------------");
		System.out.println("HP: " + this.hp);
		System.out.println("MP: " + this.mp);
		System.out.println("力: " + this.power);
	}
}
