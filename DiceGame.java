public class DiceGame {

	public static void main(String[] args) {
		
		Roll dieRoll;
		dieRoll = new Roll();


		int dieRollResult = dieRoll.roll();


		System.out.println("dieRoll results: " + dieRollResult);
		
	}


}
