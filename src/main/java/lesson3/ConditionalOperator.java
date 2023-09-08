package lesson3;

public class ConditionalOperator {
    public static void main(String[] args) {

 /*       if (1 == 1){
            System.out.println("Працює");
        } else if (2==2) {
            System.out.println("Працює 2");

        } else {
            System.out.println("було false в if");
        }*/

        int result = 0;
        String operation = "minus";

        int a = 2;
        int b = 4;

        if (operation == "plus") {
            result = a + b;
        } else if (operation == "minus") {
            result = a - b;
        }
        System.out.println(result);
    }
}
