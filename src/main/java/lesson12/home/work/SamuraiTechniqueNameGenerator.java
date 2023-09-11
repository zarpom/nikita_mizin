package lesson12.home.work;

import java.util.Random;

/**
 * Клас `SamuraiTechniqueNameGenerator` генерує ім'я для техніки бойового мистецтва в японському стилі та додає жарт про сеппуку.
 */
public class SamuraiTechniqueNameGenerator {
    public static void main(String[] args) {
        // Масиви для генерації імен техніки бойового мистецтва
        String[] firstParts = {"Синьо-вогняна", "Вітерна", "Неуцільна", "Заморожена", "Горяча", "Місячна"};
        String[] secondParts = {"Такаши", "Хідео", "Аюмі", "Сакура", "Іккаку", "Кікі"};

        // Створення об'єкта класу Random для випадкової генерації чисел
        Random rand = new Random();

        // Вибір випадкової першої та другої частин імені
        String firstPart = firstParts[rand.nextInt(firstParts.length)];
        String secondPart = secondParts[rand.nextInt(secondParts.length)];

        // Створення ім'я для техніки бойового мистецтва
        String martialArtsTechniqueName = firstPart + " " + secondPart;

        // Виведення ім'я техніки бойового мистецтва на екран
        System.out.println("Ім'я вашої техніки бойового мистецтва: " + martialArtsTechniqueName);

        // Жарт про сеппуку малодушного самурая
        System.out.println("Якщо самурай стидиться своєї техніки, він завжди може вибрати сеппуку... або тренуватися далі!");
    }
}
