package p04;

public class Hero {
	String name;
	int hp;

	// コンストラクタ①
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	// コンストラクタ②
	public Hero(String name) {
//		this.name = name;
//		this.hp = 80;
//		this.Hero(name,80); //コンストラクタは意図的に呼び出せない（原則）
		this(name, 80); // this()で「このクラスの他のコンストラクタを呼び出す」ことが出来る

	}

	// コンストラクタ③
	public Hero() {
//		this.name = "名無し";
//		this.hp = 50;
		this("名無し", 50); // 必ずコンストラクタブロックの先頭で呼び出す
		// 処理（不具合）
	}

}
