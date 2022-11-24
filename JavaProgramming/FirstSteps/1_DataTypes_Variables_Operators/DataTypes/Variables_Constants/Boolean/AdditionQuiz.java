import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {

        //generate random number with current time
        int number1 = (int)(System.currentTimeMillis() % 10); //last digit in the current time
        int number2 = (int)(System.currentTimeMillis() /10 % 10); //second last digit in the current time

        Scanner input = new Scanner(System.in);
        System.out.print(
                "What is " +  number1 + " + " + number2 + "? "
        );

        int answer = input.nextInt();

        System.out.println(
                number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer)
        );
    }
}