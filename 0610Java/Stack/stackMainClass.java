
public class stackMainClass {

	public static void main(String[] args) {
		/*
		 	Stack : First In Last Out
		 			실린더에 공을 넣고 빼는 경우
		 			in -> Push
		 			out -> Pop
		 */
		ArrayStack stack = new ArrayStack(10);
		
		String str = "aaa";
		stack.push(str);
		
		String peekstr = (String)stack.peek();
		System.out.println(peekstr);

		str = "bbb";
		stack.push(str);
		
		
	}

}
