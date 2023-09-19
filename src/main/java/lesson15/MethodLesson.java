package lesson15;

public class MethodLesson {
    public static void main(String[] args) {
        // !5 = 120
        // 1 * 2 * 3 * 4 * 5 = 120

        long num = getFactorial(20);
        System.out.println("factorial:" + num);

        String text = "Хочеш миру, готуйся до війни";
        String reverseChars = reverseSymbols(text);
        String reverseWords = reverseWords(text);

        System.out.println("reverseChars:" + reverseChars);
        System.out.println("reverseWords:" + reverseWords);


        // 8 березня, роздаємо подарунки дівчатам
        // ми знаємо що кожна 2а людина це дівчинка
        // В нас обмежена кількість подарунків
        //дізнатись скільки дівчат залишилось без подарунків (щоб докупити)

        int girlsWithoutGift = givePresent(30, 2);
        System.out.println("girls Without Gift:" + girlsWithoutGift);

        int age = 20;
        String name = (age == 19) ? "Тіма" : "Микита"; //
        System.out.println("Мітіма:" + name);
    }

    static int givePresent(int kids, int gifts) {
        int girlsWithoutGift = kids / 2 - gifts;

        return (girlsWithoutGift < 0) ? 0 : girlsWithoutGift;//тернарний оператор
    }


    static long getFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i = i + 1) {
            factorial = factorial * i;
        }
        return factorial;
    }

    static String reverseWords(String text) {
        String[] words = text.split(" ");
        String reverse = "";

        for (int i = words.length - 1; i >= 0 ; i--) {
            reverse += words[i]+" ";
        }
        return reverse;
    }

    static String reverseSymbols(String text) {
        char[] chars = text.toCharArray();
        String result = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            result += chars[i];
        }

        return result;
    }

}
