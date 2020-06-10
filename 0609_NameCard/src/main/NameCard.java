package main;

public class NameCard {
	String name;
	String phone;
	String email;
	
	
	PrintNameCard printNameCard;
	PrintNameCard2 printNameCard2;
	
	
	
	public void setPrintNameCard(PrintNameCard p) {
		this.printNameCard = p;
	}
	public void Print() {
		printNameCard.print(this);
	}
	
	public void setPrintNameCard2(PrintNameCard2 p) {
		this.printNameCard2 = p;
	}
	public void Print2() {
		printNameCard2.print(this);
	}
}
