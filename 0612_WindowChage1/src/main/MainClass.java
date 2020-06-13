package main;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	Frame 창을 교체하느방법
		 	
		 	1. close => 새로운 프레임을띄움
		 	2. setvisible(trie) =>새프레임을 띄우진않음
		 	3. panel 을 만들어 준뒤에 이벤트를 이용하여 만들어둔 패널들을 바꾸는 방법
		 */
		new WindowOne();
	}

}
