package member;
public class member {
	public member() {
		System.out.println("Member member()");
	}
	public void init() {
		System.out.println("Member init()");
	}
	public void random() {
		System.out.println("Member random()");
	}
	public void input() {
		System.out.println("Member input()");
	}
	public static member getInstance() {
		member m = new member();
		m.init();
		m.random();
		m.input();
		return m;
	}
}
