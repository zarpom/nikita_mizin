package lesson2;

public class Main {
    public static void main(String[] args) {
//        byte b1 = 127;
//
//        System.out.println((byte) (b1 + 1));
//
//        byte b2 = 100;
//        short sh1 = 0;
//        sh1 = b2;
//
//        System.out.println(sh1);
//
//        byte b3 = 1;
//        short sh2 = 10;
//
//        b3 = (byte) sh2;
//
//        System.out.println(12.4);
//
//        float fl1 = (float)  12.5;
//        float fl2 =   12.5F;
//
//        double db1 = 12.5;
//        System.out.println(fl1);
//        db1 = fl1;
//        fl2 = (float)  db1;

        int b1 = 0;
        int i1 = 129;// 127 + 2
        b1 = i1;

        System.out.println(b1);
        // 127 + 1 = -128 + 1 = -127
        // 127 + 1 = -128 + 1 = -127
        byte byteY = (byte) 1000000123;
        int i = 12;
        System.out.println("byteY=" + byteY);
    }
}
