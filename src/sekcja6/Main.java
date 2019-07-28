package sekcja6;

public class Main {
    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());
        System.out.println("*********");

        Account bobsAccount = new Account("12345",0.0,"Bob Brown",
                "myemail@gmail.com","(087) 123-4567");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        System.out.println("*****************");
        VipCustomer bob = new VipCustomer("Bob",123545.12,"AB@wp.pl");
        System.out.println(bob.getName() + " " + bob.getCreditLimit()+" "+ bob.getEmail());
        VipCustomer bobi = new VipCustomer("Bobi", 2542.25);
        System.out.println(bobi.getName() + " " + bobi.getCreditLimit()+" "+ bobi.getEmail());
        VipCustomer tim = new VipCustomer();
        System.out.println(tim.getName() + " " + tim.getCreditLimit()+" "+ tim.getEmail());

        System.out.println("**********");
        Wall wall = new Wall(5,4);
        System.out.println("area =" + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width = "+ wall.getWidth());
        System.out.println("height = "+ wall.getHeight());
        System.out.println("area = " + wall.getArea());
    }
}
