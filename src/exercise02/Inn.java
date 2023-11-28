package exercise02;

/**
 * 「宿屋」クラス
 */
public class Inn {
	public void stay(Hero guest) {
		guest.hp += 100;
		guest.sleep();
	}

	public void stay(Wizard guest) {
		guest.mp += 10;
		guest.sleep();
	}
}
