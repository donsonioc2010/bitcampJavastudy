package DiceAnswer;

public class DiceAnswer {
	private int number;
	
	public void diceRandom() {
		number = (int)(Math.random()*6)+1;
	}

	public int getNumber() {
		return number;
	}
}
