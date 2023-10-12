package lesson16;

public class Main {
    public static void main(String[] args) {


        //        int score = 0;
//        String grade;
//        if (score >= 90) {
//            grade = "A";
//        } else if (score >= 80) {
//            grade = "B";
//        } else if (score >= 70) {
//            grade = "C";
//        } else if (score >= 60) {
//            grade = "D";
//        } else {
//            grade = "F";
//        }


//        int score = 95;
//        String grade;
//
//        switch (score) {
//            case 100:
//            case 90:
//                grade = "A";
//                break;
//            case 80:
//                grade = "B";
//                break;
//            case 70:
//                grade = "C";
//                break;
//            case 60:
//                grade = "D";
//                break;
//            default:
//                grade = "F";
//                break;
//        }
//
//        System.out.println("Оцінка: " + grade);

//        if (month.equals("April")) {
//            System.out.println("Spring");
//        } else if (month.equals("May")) {
//            System.out.println("Spring");
//        }
//
//        if (month.equals("April") || month.equals("May") || month.equals("March")) {
//            System.out.println("Spring");
//        } else if  (month.equals("April") || month.equals("May") || month.equals("March")) {
////            System.out.println("Spring");

//        }

        String month = "January";
        String response = "";

        switch (month) {
            case "April":
            case "May":
            case "March":
                response = "я роскажу таємницю";
                break;

            case "February":
            case "January":
            case "December":
                response = "тобі пощастило, взимку я добрий";
                break;
        }
        System.out.println(response);


//        int numberMonth = 1;
//        if (numberMonth == 1) {
//            System.out.println("January");
//        } else if (numberMonth == 2) {
//            System.out.println("February");
//        }

//
//        System.out.println(grade);

    }
}

