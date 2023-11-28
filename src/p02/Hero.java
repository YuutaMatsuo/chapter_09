package p02;

public class Hero {
	//フィールド
	Sword s;
	//Heroインスタンスは「Sword」を持つことができる状態(has-aの関係)
	String name;
	int hp;
	int attackPoint = 10;
	
	public void attack() {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に" + this.attackPoint + "のダメージ！");
		if(this.s != null) {
			int attackDamege = this.attackPoint + this.s.damage;
			System.out.println("敵に" + attackDamege + "のダメージ！");
		}
	}
}
