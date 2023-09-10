package lesson9;

public class DecimalToBinary {
    public static void main(String[] args) {
//        System.out.println( 16% 5);// 16-15 = 1

//        int i = 0;
//        for ( ; i < 10 ; ) {
//            i++;
//            System.out.println(i);
//        }

//        int i = 0;
//        while (i < 10){
//         i++;
//            System.out.println(i);
//
//        }


        int number = 10;
        while (number != 0){
            System.out.print(number % 2);
            number /= 2;
        }




//        for ( int number = 11; number != 0; number /= 2){
//            System.out.print(number % 2);
//        }

//        System.out.println(49 / 2);


    }

}
