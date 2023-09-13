package lesson13.home.work;

public class MiyamotoMusashiLife {
    
    // Метод для визначення, чи Міямото Мусасі є легендою
    static boolean isLegend() {
        return true;
    }

    // Метод для обчислення числа збережених мечів Міямото Мусасі
    static int calculateSwordsOwned(int battlesWon) {
        int swords = battlesWon / 5; // Припускаємо, що за кожні 5 перемог Міямото Мусасі зберігає меч
        return swords;
    }

    // Метод для перевірки, чи Міямото Мусасі помер в битві
    static boolean isDeceased(boolean isAlive) {
        return !isAlive;
    }

    // Метод для визначення відомого вислову Міямото Мусасі
    static String famousQuote() {
        return "За перемогу в битві необхідно вести боротьбу в душі.";
    }

    public static void main(String[] args) {
        // Інформація про Міямото Мусасі
        int battlesWon = 50;
        boolean isAlive = true;

        // Перевірка, чи Міямото Мусасі - легенда
        boolean isLegendary = isLegend();
        System.out.println("Міямото Мусасі - легенда? " + isLegendary);

        // Обчислення кількості збережених мечів
        int swordsOwned = calculateSwordsOwned(battlesWon);
        System.out.println("Міямото Мусасі має " + swordsOwned + " збережених мечів.");

        // Перевірка, чи Міямото Мусасі помер в битві
        boolean isDeceased = isDeceased(isAlive);
        System.out.println("Міямото Мусасі помер в битві? " + isDeceased);

        // Виведення відомого вислову Міямото Мусасі
        String quote = famousQuote();
        System.out.println("Вислів Міямото Мусасі: \"" + quote + "\"");
    }
}
