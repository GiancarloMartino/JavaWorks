public class IntOperations {

    public static void main(String[] args) {
        int a; //assign an integer value
        int b; //assign an integer value
        int sum  = a + b;
        int prod = a * b;
        int sub = a - b;
        int quot = a / b;
        int rem  = a % b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + prod);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " / " + b + " = " + quot);
        System.out.println(a + " % " + b + " = " + rem);
        System.out.println(a + " = " + quot + " * " + b + " + " + rem);
    }
}