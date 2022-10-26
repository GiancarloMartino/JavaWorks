/**
 * To accept keyboard input we must sets up things for enable the program
 * */


import java.util.Scanner; //first one: gets the SCANNER class from the package(library) java.util

public class DisplayTime {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in); //second one: create a Scanner so the program can accept keyboard input

	System.out.print("Enter an integer for seconds: ");
	int seconds = input.nextInt();  //reads one integer number from the keyboard.
									// We can read different input (explore the class method!)

	int minutes = seconds/60; 
	int remainingSeconds = seconds % 60;
	System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
	}
}