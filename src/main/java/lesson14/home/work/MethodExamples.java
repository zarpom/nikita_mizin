package lesson14.home.work;
public class MethodExamples {

    // Введення до методів в Java
    // Методи в Java - це блоки коду, які виконують певну операцію та можуть бути викликані з інших частин програми.

    public static void main(String[] args) {
        int sum = addTwoNumbers(5, 7);
        System.out.println("Сума двох чисел: " + sum);

        int square = squareNumber(4);
        System.out.println("Квадрат числа: " + square);

        boolean isEvenNumber = isEven(6);
        System.out.println("Число парне: " + isEvenNumber);

        String concatenatedStr = concatenateStrings("Привіт, ", "Світ!");
        System.out.println("Результат конкатенації рядків: " + concatenatedStr);

        double average = averageOfThreeNumbers(10, 20, 30);
        System.out.println("Середнє арифметичне трьох чисел: " + average);

        int max = maxOfTwoNumbers(25, 15);
        System.out.println("Максимальне число: " + max);

        String grade = gradeFromScore(75);
        System.out.println("Оцінка за балом: " + grade);

        printBuddhaQuote();
    }

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
        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }


    // Метод, що виводить буддійську цитату
    public static void printBuddhaQuote() {
        System.out.println("Все, що ми є, є результатом того, що ми думали.");
    }
}
