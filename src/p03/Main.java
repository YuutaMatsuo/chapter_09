package p03;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		//この時点で、Heroインスタンスのコンストラクタが自動的に呼び出されている
		System.out.println("勇者の名前は" + h.name);
		System.out.println("勇者のHPは" + h.hp);
		
		//h.Hero(); //意図的には呼び出せない！
		
		//コンストラクタのオーバーロードも可能
		Hero h2 = new Hero("あさか",80);                           
		System.out.println("勇者２の名前は" + h2.name);
		System.out.println("勇者２のHPは" + h2.hp);
	}
}
