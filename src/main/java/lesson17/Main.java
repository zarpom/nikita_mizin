package lesson17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        BlackCat blackCat = new BlackCat();
//        Dog dog = new Dog();
//        Fish fish = new Fish();
//        cat.sayHello();
//        dog.sayHello();
//        fish.sayHello();
//        say(cat);
//        say(dog);
//        say(fish);
//
//        sayMeow(cat);
//        sayMeow(blackCat);
//        Animal cat = new Cat();
//        Animal dog = new Dog();
//        Animal fish = new Fish();
//
//        cat.sayHello();
//        dog.sayHello();
//        fish.sayHello();

        System.out.println("Give me animal's name");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Animal animal = new Animal();

        if (name.equals("cat")) {
            animal = new Cat();
        } else if (name.equals("dog")) {
            animal = new Dog();
        } else if (name.equals("fish")) {
            animal = new Fish();
        }
        animal.sayHello();
    }

    static void say(Animal animal) {
        animal.sayHello();
    }

    static void sayMeow(Cat cat) {
        cat.sayMeow();
    }

}

class Animal {
    void sayHello() {
        System.out.println("Hello i'm animal");
    }
}

class Cat extends Animal {
    void sayHello() {
        System.out.println("Hello i'm cat");
    }

    void sayMeow() {
        System.out.println("Meoooow!");
    }
}

class BlackCat extends Cat {
    void sayMeow() {
        System.out.println("Black meoooow!");
    }
}

class Dog extends Animal {
    void sayHello() {
        System.out.println("Hello i'm dog");
    }
}

class Fish extends Animal {
    void sayHello() {
        System.out.println("Hello i'm fish");
    }
}


