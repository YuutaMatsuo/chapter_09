package p01;

public class Hero {
	//勇者の名前
	String name;
	//勇者のHP
	int hp;
	
	//インスタンスメソッド(staticが付かないメソッド)
	public void selfAid() {
		//「this」は自分自身のインスタンスを指すフレーズ
		//「this」はインスタンスメソッドでしか使えない
		System.out.println(this.name + "はHPを回復した！");
		this.hp += 10;
	}
	
	public static void test(){
		//staticがついているため、this.nameに値を代入しようとするとコンパイルエラーになる
//		this.name = "テスト";
	}
}
