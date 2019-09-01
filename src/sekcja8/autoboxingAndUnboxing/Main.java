package sekcja8.autoboxingAndUnboxing;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank ("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 12.50);
        bank.addCustomer("Adelaide" , " Mike ", 143.58);
        bank.addCustomer("Adelide","Percy",220.14);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","Bob",150.77);

        bank.addCustomerTransaction("Adelaide","Tim",556.78);
        bank.addCustomerTransaction("Adelaide","Mike",6.78);
        bank.addCustomerTransaction("Adelaide","Percy",100.00);

        bank.listCustomers("Adelaide",true);

    }
}
