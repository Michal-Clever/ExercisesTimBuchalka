package sekcja9.abstractClasses;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("York");
        dog.eat();
        dog.breathe();
        System.out.println("================");
        Parrot parrot = new Parrot("Ara");
        parrot.eat();
        parrot.breathe();
        parrot.fly();
        System.out.println("================");
        Penguin penguin = new Penguin("Tabalugo");
        penguin.eat();
        penguin.breathe();
        penguin.fly();


    }
}
