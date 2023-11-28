package p01;

public class Main {
	public static void main(String[] args) {
		//Hero型の変数「h」に、新しHeroインスタンスを生成して代入
		Hero h = new Hero();
		//Hero型の変数「h」に、変数「h」が指すインスタンスのアドレス情報を代入
		Hero h2 = h;
		
		//フィールドに値を設定
		h.name = "みなと";
		h.hp = 100;

		
		//参照しているインスタンスが同じ
		System.out.println("hの名前は" + h.name);
		System.out.println("h2の名前は" + h2.name);
		h.selfAid();
		
		//なぜString型のインスタンス化をする際に「new」を書かなくてよいのか？
		//String型はよく利用されるため、特別に基本データ型のような振る舞いができる。
		String str = "こんにちは";
		String str2 = new String("こんにちは");
		
		System.out.println(str);
		System.out.println(str2);
	}
}
