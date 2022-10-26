import java.util.Arrays; //importo la classe Arrays

public class MySoredArray {
    public static void main(String[] args) {
        // dichiaro un array di tipo intero e lo inizializzo(lo istanzio fisicamente!)
        int[] myArray = new int[]{20, 4, 6, 8, 2, 1, 19};

        //stampa stringa per comunicare il risultato successivo
        System.out.print("myArray unsorted: ");

        //richiama il metodo statico .toString() nella classe Array
        System.out.println(Arrays.toString(myArray));

        //faccio l'ordinamento dell'array
        Arrays.sort(myArray); //richiamo il metodo statico .sort() nella classe Array

        //Stampo l'array ordinato
        System.out.print("myArray sorted: ");
        System.out.println(Arrays.toString(myArray));
    }
}