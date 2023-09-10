package lesson10;

public class DecimalToBinary {
    public static void main(String[] args) {


//        String text = "1";
//        text = text + ")";
//
//        text = "хуй " + text;
//        text = "пізда" + text;
//        text = "небінарна персона" + text;
//
//
//        text = text + "корова";
//
//
//        System.out.println(text);


        int number = 10;
        String binaryFullNumber = "";

        while (number != 0) {
            binaryFullNumber = number % 2 + binaryFullNumber;
            number /= 2;
        }

        System.out.println(binaryFullNumber);


//        String per = "";
//        for (int i = 0; i < 10; i++) {
//            per =  i + per;
//
//        }
//
//        System.out.println(per);

//        String numbersString = "";
//
//        numbersString = 1 + numbersString;
//        numbersString = 2 + numbersString;
//        numbersString = 3 + numbersString;
//        numbersString = 4 + numbersString;
//        numbersString = numbersString + 5;
//
//        System.out.println(numbersString);


        String text = "start";

        text = "початок2" + text;

        text = text + "початок3";


        System.out.println(text);

    }


}
