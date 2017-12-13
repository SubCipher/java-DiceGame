public class Roll {


	double rollSum = 0;
	
	double dieResult00; 
	double dieResult01; 
	
 	public void diceRoll(){	

		dieResult00 = Math.random() * 6 + 1.0;
		dieResult01 = Math.random() * 6 + 1.0;
		}

	public int roll(){

		diceRoll();
	
		if (dieResult00 == dieResult01){
		
			System.out.println("double roll!" +  dieResult00  + dieResult01);

			rollSum = (dieResult00 + dieResult01);
			diceRoll();

			rollSum += (dieResult00 + dieResult01);

			return (int) rollSum;
		
		} else { 
			
			System.out.println("die results!" + " " + dieResult00  + " " + dieResult01);
			return (int)(dieResult00 + dieResult01);
	
		} 

	}
	
}
