package lesson10;

public class BubleSorting2 {

    public static void main(String[] args) {
        int age = 23;
        int age2 = 27;

        System.out.println(age + " and " + age2);

        age = age2; // age стає 27
        age2 = age; // age2 присваєюмо age (27)

        System.out.println(age + " and " + age2);
        int age3 = 13;
        int age4 = 17;

        int temp = age3;
        age3 = age4;
        age4 = temp;

        String myOrgan = "Хвора печінка";
        String childOrgan = "Здорова чудова печінка";

        String mysteryBox = myOrgan;

        myOrgan = childOrgan;
        childOrgan = mysteryBox;


        System.out.println(myOrgan + " and " + childOrgan);
        //сode for swap entity




    }
}

