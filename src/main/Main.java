package main;
import cat.Cat;
import dog.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.giveVoice();

        Dog dog = new Dog();
        dog.giveVoice();
    }
}
