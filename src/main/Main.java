package main;

import java.util.Random;

import javax.swing.JOptionPane;

/*
 * Random Number 1-10 Guessing game
 * 
 * Created by Carter Watts on January 23, 2019
 * 
 */

public class Main {
	
	//Variables
	static String name,guessS;
	static int guess,randInt;
	static Random rand = new Random();
	
	static boolean wrong = true; //Used in while loop, true if guess if wrong (default), false once # guessed correctly
	
	public static void main(String[] args) {
	
		//Random int generation
		randInt = rand.nextInt((10 - 1) + 1) + 1;
		System.out.println(randInt);
		
		//Initial User input
		name = JOptionPane.showInputDialog("What is your name?");
		guessS = JOptionPane.showInputDialog("Welcome "+ name+" \nGuess A Number Between 1 - 10");
		
		//Try catch for converting guess input to int NOTE: succepteble to commands such as "\n"
		try {
			guess = Integer.parseInt(guessS);
		} catch (Exception e) {
			guessS = JOptionPane.showInputDialog("Welcome "+ name+" \nGuess A NUMBER Between 1 - 10");
		}
		
		//Loop to allow multiple guessed
		while(wrong && guessS != null) {
			if (guess == randInt) {
				//Shows user they guessed correctly
				JOptionPane.showMessageDialog(null,"You Guessed Correctly\nGoodbye");
				wrong = false;
			} else {
				//Allows input for guesses after first attempt
				guessS = JOptionPane.showInputDialog(null,"You Guessed Wrong\nTry again");
				guess = Integer.parseInt(guessS);
			}
		}
		
		//Goodbye
		System.exit(0);
		
	}
	
}
