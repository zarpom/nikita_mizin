package lesson14.home.work;
public class MethodExamples {

    // Введення до методів в Java
    // Методи в Java - це блоки коду, які виконують певну операцію та можуть бути викликані з інших частин програми.

    // Метод для додавання двох чисел
    public static int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    // Метод для знаходження квадрату заданого числа
    public static int squareNumber(int num) {
        return num * num;
    }

    // Метод для перевірки парності числа
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Метод для конкатенації двох рядків
    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    // Метод з параметрами, що обчислює середнє арифметичне трьох чисел
    public static double averageOfThreeNumbers(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    // Метод з повертанням значення, що знаходить максимум двох чисел
    public static int maxOfTwoNumbers(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    // Метод з кількома операторами повернення, що визначає оцінку на основі заданого балу
    public static String gradeFromScore(int score) {
        int scoreResult = 0;
        if(score >= 90) {
            return "A";
        } else if(score >= 80) {
            return "B";
        } else if(score >= 70) {
            return "C";
        } else if(score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Метод, що виводить буддійську цитату
    public static void printBuddhaQuote() {
        System.out.println("Все, що ми є, є результатом того, що ми думали.");
    }
}
