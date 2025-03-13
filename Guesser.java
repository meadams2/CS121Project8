//Guesser Class 

import java.util.Random;
import java.util.Scanner;

public class Guesser {
	public static void main(String[] args){
		Guesser game = new Guesser();
	} //end main
	
	public Guesser(){
		boolean keepGoing = true;
		while (keepGoing){
			String userResponse = menu();
			if (userResponse.equals("0")){
				keepGoing = false;
			} //end exit condition
			
			else if (userResponse.equals("1")){
				humanGuesser();
			} //end Human Guesser condition
		/*	
			else if (userResponse.equals("2"){
				computerGuesser();
			} //end Computer Guesser condition
			*/
		} // end while loop
	} //end constructor
	
	public String menu(){
		java.util.Scanner menuInput = new java.util.Scanner(System.in);
		System.out.println("0) Exit");
		System.out.println("1) Human Guesser");
		System.out.println("2) Computer Guesser");
		System.out.println("Please enter 0-2: ");
		String menuResponse = menuInput.nextLine();
		return menuResponse;
	} //end menu
	
	public int findMean(int num1, int num2){
		int sum = num1 + num2;
		int mean = (int)sum/2;
		return mean;
	} //end findMean
	
	public void humanGuesser(){
		int correctNum = (int)(Math.random() * 101);
		System.out.println("Correct Number: " + correctNum);
		java.util.Scanner guessInput = new java.util.Scanner(System.in);
		boolean keepGoing = true;
		int turns = 0;
	
		while(keepGoing){
			System.out.print(turns + ") Please enter a number: ");
			String sUserGuess = guessInput.nextLine();
			int userGuess = Integer.parseInt(sUserGuess);

			if(userGuess == correctNum){
				System.out.println("Got it!");
				keepGoing = false;
			} //end correct condition
			else if(userGuess < correctNum){
				System.out.println("Too low.");
				turns += 1;
			} //end too low condition
			else if(userGuess > correctNum){
				System.out.println("Too high.");
				turns += 1;
			} //end too high condition
			
			if (turns >= 7){
				System.out.println("Out of Turns!");
				keepGoing = false;
			} //end turns condition	
		} //end while loop
	} //end Human Guesser
} //end guesser class	
