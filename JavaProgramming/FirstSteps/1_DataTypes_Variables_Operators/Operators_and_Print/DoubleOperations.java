public class DoubleOperations {

    public static void main(String[] args) {
        double a; //assign a double value to variable
        double b; //assign a double value to variable
        double sum  = a + b;
        double prod = a * b;
        double sub  = a - b ;
        double quot = a / b;
        double rem  = a % b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + prod);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " / " + b + " = " + quot);
        System.out.println(a + " % " + b + " = " + rem);

        System.out.println();
        System.out.println("sin(pi/2) = " + Math.sin(Math.PI/2)); //remember to import Math library!
        System.out.println("log(e)    = " + Math.log(Math.E));
    }
}