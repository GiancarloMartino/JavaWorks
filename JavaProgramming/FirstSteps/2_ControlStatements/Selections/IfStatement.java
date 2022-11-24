import java.util.Scanner;

class IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 5 == 0)  //if the statement in the block is evaluated true
            System.out.println("HiFive"); //then this statement is executed
        if (number % 2 == 0) //if the statement in the block is evaluated true
            System.out.println("HiEven"); //then this statement is executed
    }
}