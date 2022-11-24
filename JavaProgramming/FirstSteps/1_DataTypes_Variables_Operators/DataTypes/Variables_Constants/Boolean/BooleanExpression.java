//boolean data type declares a variable with the value either true or false
class BooleanExpression{
    public static void main(String[] args) {

        boolean engineOn = true; //declaration of a boolean variable
        System.out.println("print of engineOn variable value: " + engineOn);

        //with booleans data type wes can evaluate a comparison
        double raggio = 1;
        System.out.println("raggio = 1 is major to 0: " + (raggio > 0) ); //true
        System.out.println("raggio = 1 is equal to 0: " + (raggio == 0)); //false
        System.out.println("raggio = 1 is minor to 0: " + (raggio < 0)); //false
        System.out.println("raggio = 1 is major or equal to 0: " + (raggio >= 0)); //true
        System.out.println("raggio = 1 is minor or equal to 0: " + (raggio <= 0)); //false
        System.out.println("raggio = 1 is Not equal of 0: " + (raggio != 0)); //true

    }
}