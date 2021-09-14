/*
 /* Written by Bella Myer
 */
import java.util.Scanner;
public class Quarters2pennies {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter value between 0 and 99");
		int coins = keyboard.nextInt();
		//I defined the variable coins to make it stand in for something
		System.out.println(coins + " cents in coins:");
		//This starts by defining the other variables and grouping them under coins
		int quarters = coins;
		quarters = quarters - (quarters % 25);
		quarters = quarters/25;
		coins = coins - (quarters*25);
		//Quarters are defined under coins and they are moded by the 25 so it's a constant 
		int dimes = coins;
		dimes = dimes - (dimes % 10);
		dimes = dimes/10;
		coins = coins - (dimes*10);
		//I did the same thing for dimes as I did for quarters and subtract it from the value of coins so that it will keep changing into cents.
		int nickels = coins;
		nickels = nickels - (nickels % 5);
		nickels = nickels/5;
		coins = coins - (nickels*5);
		//At the end I just defined pennies as coins because it means the left over change are pennies
		int pennies = coins;
		//At this part I finished with the output of the coin names and the values.
		System.out.println(quarters + " Quarters");
		System.out.println(dimes + " Dimes");
		System.out.println(nickels + " Nickels");
		System.out.println(pennies + " Pennies");

	}

}
