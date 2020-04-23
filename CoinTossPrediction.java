import java.util.Scanner;
public class CoinTossPrediction {
	private Scanner myScan;
	private int numTosses;
	private int numCorrect=0;
	private double propCorrect;
	private boolean didBeatOdds;
	
	public CoinTossPrediction() {
		System.out.println("How many tosses would you like?");
		myScan = new Scanner(System.in);
		numTosses=myScan.nextInt();
	}
	public double makePredictions() {
		for(int i=0;i<numTosses;i++) {
			System.out.println("1. Heads or 2. Tails (please input the number)");
			myScan = new Scanner(System.in);
			double toss = Math.random();
			if((toss<0.5 && myScan.nextInt()==1)||(toss>=0.5 && myScan.nextInt()==2)){
				numCorrect++;
				System.out.println("Win.");
			} else {
				System.out.println("Sorry, you lose.");
			}
		}
		propCorrect = ((double)numCorrect)/numTosses;
		propCorrect+=0.005;
		propCorrect = (int)(propCorrect*100);
		propCorrect /= 100;
		return propCorrect;
	}
	public void printResult() {
		System.out.println("Percentage correct: "+ (propCorrect*100) + "%");
		if(propCorrect>0.5) {
			System.out.println("Congrats, you beat the odds!");
			didBeatOdds = true;
		} else {
			System.out.println("Rats, you didn't beat the odds.");
			didBeatOdds = false;
		}
		
	}

}
