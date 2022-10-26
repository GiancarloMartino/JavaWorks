import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        //variabili necessarie al programma;

        int secretNumber;
        int yourNumber;
        boolean isUnGuessed = true;

        Scanner keyboard = new Scanner(System.in);
        secretNumber = (int) (Math.random() * 100);

        System.out.println("Indovina il numero che ho generato casualmente!");


        //processo
        while (isUnGuessed) {
            System.out.println("Inserisci il tuo numero: ");
            yourNumber = keyboard.nextInt();
            if (yourNumber > secretNumber) {
                System.out.println("Troppo grande!");
                continue;
            } else if (yourNumber < secretNumber) {
                System.out.println("Troppo piccolo!");
                continue;
            } else {
                isUnGuessed = false;
                System.out.println("Complimenti hai indovinato!");
            }
        }
    }
}