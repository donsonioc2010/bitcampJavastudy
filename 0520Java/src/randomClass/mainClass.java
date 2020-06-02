package randomClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	random : 난수 , 무작위
		 	↕
		 	pattern 
		 	
		 	random
		 	1 ~ 5
		 	1 ~ 45
		 */
		int rnum;
		rnum = (int)(Math.random()*5);//5: 0-4중 무작위 뽑기
		//System.out.println("ruum = "+rnum);
		
		//0-9
		rnum = (int)(Math.random()*10);//5: 0-4중 무작위 뽑기
		System.out.println("ruum = "+rnum);
		
		//10-20
		rnum = (int)(Math.random()*11)+10;//5: 0-4중 무작위 뽑기
		System.out.println("ruum = "+rnum);
		
		//10 20 30 40 50
		rnum = ((int)(Math.random()*5)+1) * 10;//5: 0-4중 무작위 뽑기
		System.out.println("ruum = "+rnum);
		//-1 0 1
		rnum = ((int)(Math.random()*3)-1)
				;//5: 0-4중 무작위 뽑기
		System.out.println("ruum = "+rnum);
		
	}

}
