package OperatorClass1;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	Operator
		 	+, -, *, /, %
		 	/ : ���� ��
		 	% : ������ ���� ������
		 */
		int num1 = 25 , num2 = 7 , result;
		
		
		
		result = num1 + num2;
		System.out.println("num1 + num2 = "+result);
		result = num1 - num2;
		System.out.println("num1 - num2 = "+result);
		result = num1 * num2;
		System.out.println("num1 * num2 = "+result);
		result = num1 / num2;
		System.out.println("num1 / num2 = "+result);
		result = num1 % num2;
		System.out.println("num1 % num2 = "+result);
		
		int number = 0;
		
		number = number+1;
		number +=1;
		
		// increment(����������) ++
		number++;
		++number;
		// decrement(���ҿ�����) --
		number--;
		--number;
		
		System.out.println(number);
		
		int tag;
		
		tag = ++number;
		System.out.println("number: "+number+" number: "+tag);
		tag = number++;
		System.out.println("number: "+number+" number: "+tag);
		tag = (number++);
		System.out.println("number: "+number+" number: "+tag);
	}

}
