// Name Of Programmer: Kabir Jain
//Date of Completion:October 6th 2021
//Name of program: Slot Machine Game Version 1.0
//Description: This program is designed to output 3 random values in the 1-3. The game is to
//either get 2 of the same numbers, or get all 3 numbers the same. On the basis of this, 
//you will be awarded tokens.

import java.util.Scanner;
public class SlotMachine {
	public static void main(String [] args) {
		int wheelOne = (int)(Math.random()*3) +1; //Declaration of the first "spinning wheel"
		int wheelTwo = (int)(Math.random()*3) +1;//Declaration of the second "spinning wheel"
		int wheelThree = (int)(Math.random()*3) +1;//Declaration of the third "spinning wheel"
		System.out.printf("You got %d %d %d %n", wheelOne, wheelTwo, wheelThree);
		
		// Calculating the different outcomes possible and giving an appropriate output
		
		if (wheelOne == 1 && wheelTwo ==1 && wheelThree == 1) 
		{
			System.out.println("You have won 4 tokens!");
		}
		
		else if (wheelOne == 2 && wheelTwo == 2 && wheelThree == 2) 
		{
			System.out.println("You have won 8 tokens!");
		}
		
		else if (wheelOne == 3 && wheelTwo == 3 && wheelThree == 3) 
		{
			System.out.println("You have won 12 tokens!");

		}
		
		else if(wheelOne == wheelThree || wheelOne == wheelTwo || wheelTwo == wheelThree) 
		{
			System.out.println("You have won 1 token");
		}
		
		else {
			System.out.println("You have not won anything, please try again");
		}
	}

}
