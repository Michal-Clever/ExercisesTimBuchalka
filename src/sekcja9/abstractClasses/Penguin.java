package sekcja9.abstractClasses;

public class Penguin extends Parrot {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
          System.out.println("I'm not very good at that , can I go for a swim instead?");
    }

}
