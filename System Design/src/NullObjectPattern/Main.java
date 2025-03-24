package NullObjectPattern;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = CustomerFactory.getCustomer("John");
        Customer customer2 = CustomerFactory.getCustomer("Bob");  // Not in the list
        Customer customer3 = CustomerFactory.getCustomer("Alice");

        System.out.println("Customer 1: " + customer1.getName());
        System.out.println("Customer 2: " + customer2.getName());  // Outputs "Not Available"
        System.out.println("Customer 3: " + customer3.getName());
    }
}
