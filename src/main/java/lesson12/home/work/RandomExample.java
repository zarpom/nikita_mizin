package lesson12.home.work;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        // Створення об'єкта класу Random
        Random rand = new Random();

        // Генерація випадкового цілого числа в межах від 0 до 9
        int randomNumber1 = rand.nextInt(10);
        System.out.println("Випадкове число від 0 до 9: " + randomNumber1);

        // Генерація випадкового цілого числа в межах від 1 до 6 (симуляція кидка кубика)
        int randomNumber2 = rand.nextInt(6) + 1;
        System.out.println("Випадкове число від 1 до 6: " + randomNumber2);

        // Генерація випадкового числа з плаваючою точкою від 0.0 до 1.0
        double randomDouble = rand.nextDouble();
        System.out.println("Випадкове дійсне число від 0.0 до 1.0: " + randomDouble);

        // Генерація випадкового числа з плаваючою точкою в межах від 0.0 до 10.0
        double randomDoubleInRange = rand.nextDouble() * 10;
        System.out.println("Випадкове дійсне число від 0.0 до 10.0: " + randomDoubleInRange);

        // Генерація випадкового булевого значення (true або false)
        boolean randomBoolean = rand.nextBoolean();
        System.out.println("Випадкове булеве значення: " + randomBoolean);
    }
}
