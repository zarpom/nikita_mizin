package lesson2;

public class BooleanLesson {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

//        if(1 > 2){
//            System.out.println("if1");
//        }else {
//            System.out.println("else");
//        }

//        System.out.println(12 > 1);
//        System.out.println(1 == 1);
//        System.out.println(2 != 2);
//        System.out.println(-4 > 1);
        System.out.println(1 > 0 && 1 < 0); //(true and false)

        System.out.println(1 > 0 || 1 < 0);//(true or false)

        System.out.println((14 > 0 && -1 < 0) || (14 > 0 && -1 < 0 && 12 == 3)); // (true) || (false)

    }
}
