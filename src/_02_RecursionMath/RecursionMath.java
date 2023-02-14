package _02_RecursionMath;

public class RecursionMath {

	public static int recursiveMultiplication(int number, int times) { // repeated add
		if (times == 1) {
			// If times is 1
			// Return number
			return number;
		}
		// Else return number + recursiveMultiplication(number, times-1)
		else {
			return number + recursiveMultiplication(number, times - 1);
		}
	}

	// Try this one on your own!
	// Hint: if numberToDivideBy is bigger than number,
	// you can't divide anymore
	public static int recursiveDivision(int number, int numberToDivideBy) {
		if (numberToDivideBy > number) {
			return 0;
		} else {
			number = number - numberToDivideBy;
			return 1 + recursiveDivision(number, numberToDivideBy);
		}
	}

	// Try this one on your own!
	public static int recursivePower(int number, int power) {
		if (power == 1) {
			return number;
		} 
		else {
			System.out.println(number);
			return number * recursivePower(number, power - 1);
		}
	}
}
