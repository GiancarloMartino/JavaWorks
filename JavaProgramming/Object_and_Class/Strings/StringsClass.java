class StringsClass{
    public static void main (String [] args){
        //dichiarare una variabile di tipo String
        String s1 = "no";
        System.out.println(s1);

        //in java è equivalente  a dichiarare:
        char characters[] = {'n','o'}; //array di caratteri
        String s2 = new String(characters); //creo oggetto di tipo stringa e passo un array di caratteri
        System.out.println(s2);
    }
}