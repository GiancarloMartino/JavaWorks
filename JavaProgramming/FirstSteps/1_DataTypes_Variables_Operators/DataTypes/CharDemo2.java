//questo programma stampa tutti i caratteri assegnati ad un valore numero
public class CharDemo2 {
    public static void main(String[] args) {
        char carattere;
        int i;
        for (i = 1; i < 123; i++ ){
            if(i >= 65){
                carattere = (char) i;
                System.out.println(carattere);
            }
        }
    }
}