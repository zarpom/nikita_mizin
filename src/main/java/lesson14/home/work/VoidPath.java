package lesson14.home.work;

import java.util.Arrays;

public class VoidPath {
    public static void main(String[] args) {
        // Вправа 1: Миска Будди
        int[] bowl = {3, 5, 7, 2, 8};
        emptyBowl(bowl);

        // Вправа 2: Середина
        int[] numbers = {1, 2, 3, 4, 5};
        int middle = middleNumber(numbers);
        int expectedMiddle = 3; // Очікуване значення середнього
        System.out.println("Середнє число: " + middle);
        System.out.println("Очікуване середнє число: " + expectedMiddle);
        System.out.println("Результат співпадає: " + (middle == expectedMiddle));

        // Вправа 3: Мантри
        String[] mantras = {"Om", "Mani", "Padme", "Hum"};
        String mantraToCount = "Mani";
        int count = countMantras(mantras, mantraToCount);
        int expectedCount = 1; // Очікувана кількість разів, як mantraToCount зустрічається в мантрах
        System.out.println("Кількість разів, як " + mantraToCount + " зустрічається в мантрах: " + count);
        System.out.println("Очікувана кількість: " + expectedCount);
        System.out.println("Результат співпадає: " + (count == expectedCount));

        // Вправа 4: Сортування Сангхи
        int[] ages = {30, 25, 40, 18, 50};
        sortSangha(ages);
        int[] expectedAges = {18, 25, 30, 40, 50}; // Очікуваний вік членів сангхи після сортування
        System.out.println("Вік членів сангхи після сортування: " + Arrays.toString(ages));
        System.out.println("Очікуваний вік після сортування: " + Arrays.toString(expectedAges));
        System.out.println("Результат співпадає: " + Arrays.equals(ages, expectedAges));

        // Вправа 5: Порожній рядок
        String s1 = "Будда";
        String s2 = "";
        boolean isEmpty1 = isEmpty(s1);
        boolean isEmpty2 = isEmpty(s2);
        boolean expectedEmpty1 = false; // Очікуване значення для s1
        boolean expectedEmpty2 = true;  // Очікуване значення для s2
        System.out.println("Чи є рядок '" + s1 + "' порожнім? " + isEmpty1);
        System.out.println("Очікуване значення для '" + s1 + "': " + expectedEmpty1);
        System.out.println("Результат співпадає: " + (isEmpty1 == expectedEmpty1));
        System.out.println("Чи є рядок '" + s2 + "' порожнім? " + isEmpty2);
        System.out.println("Очікуване значення для '" + s2 + "': " + expectedEmpty2);
        System.out.println("Результат співпадає: " + (isEmpty2 == expectedEmpty2));

        // Вправа 6: Чотири благородних істини
        String[] truths = {"Страждання", "Причина страждання", "Знищення страждання", "Шлях до знищення страждання"};
        boolean areFourNobleTruths = fourNobleTruths(truths);
        boolean expectedTruths = true; // Очікуваний результат
        System.out.println("Чи є це чотири благородні істини? " + areFourNobleTruths);
        System.out.println("Очікуваний результат: " + expectedTruths);
        System.out.println("Результат співпадає: " + (areFourNobleTruths == expectedTruths));

        // Вправа 7: Колесо Дхарми
        int n = 3;
        String s = "Дхарма";
        turnWheel(n, s);

        // Вправа 8: Таймер медитації
        int meditationMinutes = 20;
        meditationTimer(meditationMinutes);
    }

    // Вправа 1: Миска Будди
    public static void emptyBowl(int[] bowl) {
        // Ваш код тут
    }

    // Вправа 2: Середина
    public static int middleNumber(int[] numbers) {
        // Ваш код тут
        // Поверніть результат
        return 0;
    }

    // Вправа 3: Мантри
    public static int countMantras(String[] mantras, String mantra) {
        // Ваш код тут
        // Поверніть результат
        return 0;
    }

    // Вправа 4: Сортування Сангхи
    public static void sortSangha(int[] ages) {
        // Ваш код тут
    }

    // Вправа 5: Порожній рядок
    public static boolean isEmpty(String s) {
        // Ваш код тут
        // Поверніть результат
        return false;
    }

    // Вправа 6: Чотири благородних істини
    public static boolean fourNobleTruths(String[] truths) {
        // Ваш код тут
        // Поверніть результат
        return false;
    }

    // Вправа 7: Колесо Дхарми
    public static void turnWheel(int n, String s) {
        // Ваш код тут
    }

    // Вправа 8: Таймер медитації
    public static void meditationTimer(int minutes) {
        // Ваш код тут
    }

}