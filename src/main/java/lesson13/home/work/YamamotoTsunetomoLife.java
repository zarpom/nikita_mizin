package lesson13.home.work;

public class YamamotoTsunetomoLife {

    // Метод для визначення, чи Ямамото Цунетомо є відомим автором книги
    static boolean isAuthorOfBook() {
        return true;
    }

    // Метод для обчислення кількості відвіданих місць Ямамото Цунетомо
    static int placesVisited() {
        return 20; // Припускаємо, що він відвідав 20 місць.
    }

    // Метод для визначення, чи Ямамото Цунетомо був вірним послідовником кодексу бушідо
    static boolean followedBushidoCode() {
        return true; // Припускаємо, що він був вірним послідовником кодексу бушідо.
    }

    // Метод для визначення країни народження Ямамото Цунетомо
    static String countryOfBirth() {
        return "Японія";
    }

    // Метод для визначення улюбленої зброї Ямамото Цунетомо
    static String favoriteWeapon() {
        return "Катана";
    }

    public static void main(String[] args) {
        // Інформація про Ямамото Цунетомо

        // Перевірка, чи Ямамото Цунетомо є автором книги
        boolean isAuthor = isAuthorOfBook();
        System.out.println("Ямамото Цунетомо - автор книги? " + isAuthor);

        // Обчислення кількості відвіданих місць
        int visitedPlaces = placesVisited();
        System.out.println("Ямамото Цунетомо відвідав " + visitedPlaces + " місць.");

        // Перевірка, чи Ямамото Цунетомо був вірним послідовником кодексу бушідо
        boolean followedBushido = followedBushidoCode();
        System.out.println("Ямамото Цунетомо був вірним послідовником кодексу бушідо? " + followedBushido);

        // Виведення країни народження
        String birthCountry = countryOfBirth();
        System.out.println("Ямамото Цунетомо народився в " + birthCountry + ".");

        // Виведення улюбленої зброї
        String weapon = favoriteWeapon();
        System.out.println("Улюблена зброя Ямамото Цунетомо: " + weapon);
    }
}
