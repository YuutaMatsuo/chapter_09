package p03;

public class Hero {
	//インスタンス化した後に必ず値を設定したい
	String name;
	int hp;
	
	//コンストラクタ（インスタンス化の際に1度だけ自動的に実行される特殊なメソッド）
	public Hero() {
	this.name = "みなと";
	this.hp = 100;
	}
	
	public Hero(String name,int hp) {
	this.name = name;
	this.hp = hp;
	}
}
