package lesson8;

public class LoopInLoop {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i < 10; i++) {
            System.out.println("* я ходжу в баню " + i + " раз.");
            for (int j = 1; j < 5; j++) {
                System.out.println("+ мене вдарили Вінником " + j + " разів;");
                for (int k = 1; k < 3; k++) {
                    count++;
                    System.out.println(count);
                    System.out.println("-- І ось після удару я застогнав " + k + " разів;");
                }
            }
        }
//        System.out.println("Я стогнав " + count + " разів!");
    }
}