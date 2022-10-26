public class KilometersExercise{
	public static void main(String[] args){
		/**
		 * '=' is the assignment operator: an assignment statement gives a value to a variable
		 * An assignment statement that has a variable of a primitive type on the left side of the equal sign causes:
		 * first the expression on the right side of the equal sign is evaluated, and then the variable onthe left side
		 * of the equal sign is set to this value.
		 * SYNTAX
		 * Variable = Expression;
		 * Example
		 * number = number + 2;
		*/
			double miles = 100;// assign value 100
			final double KILOMETERS_PER_MILE = 1.609; //declare a Constant
			double kilometers = miles * KILOMETERS_PER_MILE; // assign an expression to a variable

			System.out.println(kilometers); //print value of previous assignment statement
	}
}