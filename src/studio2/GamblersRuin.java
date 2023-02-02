package studio2;
import java.util.Scanner;


public class GamblersRuin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Start Amount?");
		int startAmount = in.nextInt();
	
		System.out.print("Win Limit?");
		int winLimit = in.nextInt();
		double winChance  = Math.random();
		//		boolean winChance1 = winChance >= 0.5;

		int totalSimulations = 5;

		for(int i = 0; i < totalSimulations; i++ ) {
			int startAmountNew = startAmount;
			while (startAmountNew > 0 && startAmountNew <= winLimit) {	
				winChance  = Math.random();
				if (winChance >= .5)
				{
					startAmountNew += 1;
					System.out.println ("New total: "+startAmountNew);

				}
				else
				{
					startAmountNew -= 1;
					System.out.println ("New total: " +startAmountNew);

				}

			} 

			{
				if (startAmountNew > startAmount)
				{
					System.out.println ("You win!");
				}
				else
				{
					System.out.println("You Lose :(");
				}
			}
		}

	}
}
