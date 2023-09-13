package lesson13;

public class MethodLesson {
    public static void main(String[] args) {
        String text = "Вік живи, вік вчись! - це мені казав мій Любий дід.";
        String grandDedText = "Вік живи, вік вчись!";

        text = text.replace(grandDedText, getAbb(grandDedText));
        System.out.println(text);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("ОГО ЄБАТЬ:" + sc.nextLine());

        System.out.println(powTo2(16));
        isGandon(false);
        helloDev("Mikita");


        double salary = getSalary("Mikitosik");
        System.out.println(salary);


//        System.out.println(sum(10, -100));
//
//
//        System.out.println(isPairNumber(3));
//
//        boolean isPair = isPairNumber(3);
//        System.out.println(isPair);

    }

    static boolean isPairNumber(int number) {
        return number % 2 == 0;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double getSalary(String name) {
        double salary = 0;

        if (name == "Vitalii") {
            salary = 156_000;
        } else if (name == "Mikitosik") {
            salary = 155_999;
        }
        return salary;
    }

    static void helloDev(String dev) {
        System.out.println("Вітаю з днем розробника," + dev);
    }

    static void isGandon(boolean isGandon) {
        if (isGandon) {
            System.out.println("ТИ ШО РІЛ СПРАВЖНІЙ ДЕПУТАТ???");
        } else {
            System.out.println("А чого не депутат????");
        }
    }

    static String getAbb(String grandDedText) {
        String[] words = grandDedText.split(" ");
        String shortResult = "";
        for (int i = 0; i < words.length; i++) {
            shortResult += words[i].substring(0, 1).toUpperCase();
        }
        return shortResult;
    }
    static int powTo2(int number) {
        return number * number;
    }
}
