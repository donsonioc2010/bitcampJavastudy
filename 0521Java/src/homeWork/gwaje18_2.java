package homeWork;

public class gwaje18_2 {

	public static void main(String[] args) {
		int num = 0,line = 0;
		/*
		for(int i = 1; i<10; i++) {
			line = i;
			if(line>=6) {
				num = num +2;
				line = line - num;
			}
			for(int j = 0; j<line; j++ ) {
				System.out.print("*");
			}
			if(line>=6) {
				line += num;
			}
			System.out.println();
		}
		*/
		
		for(int i = 0;i<9;i++) {
			if(i<5) line +=1;
			else 	line -=1;
			
			for(int j = 0; j<line; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int stars[] = {2,1,3,5,1,4};
		for(int x = 0; x<6; x++) {
			for(int y = 0; y<stars[x];y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
