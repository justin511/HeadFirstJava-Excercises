package Chp5;

public class SimpleDotComGame {
	public static void main(String[] args) {
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		SimpleDotCom dot = new SimpleDotCom();
			
		int randomNum = (int) (Math.random() * 5);	//random number between 0 and 4
	
		int[] locationCells = {randomNum, randomNum+1, randomNum+2};
		dot.setLocationCells(locationCells);

		boolean isAlive = true;
		
		while (isAlive) {
			String guess = helper.getUserInput("Enter a number: ");
			String result = dot.checkYourself(guess);
			
			numOfGuesses++;
			
			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
		
	}
}