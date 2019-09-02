package sekcja8.autoboxingAndUnboxing;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        if (bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch created");
        }

        bank.addCustomer("Adelaide", "Tim", 12.50);
        bank.addCustomer("Adelaide", "Mike", 143.58);
        bank.addCustomer("Adelaide", "Percy", 220.14);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.77);

        bank.addCustomerTransaction("Adelaide", "Tim", 556.78);
        bank.addCustomerTransaction("Adelaide", "Mike", 6.78);
        bank.addCustomerTransaction("Adelaide", "Percy", 100.00);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");

        if (!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if (!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }

        if (!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Adelaide", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }


    }
}
