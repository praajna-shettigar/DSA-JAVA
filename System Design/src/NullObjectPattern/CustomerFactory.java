package NullObjectPattern;

// CustomerFactory to return RealCustomer or NullCustomer based on input
class CustomerFactory {
    private static final String[] names = {"John", "Jane", "Alice"};

    public static Customer getCustomer(String name) {
        for (String n : names) {
            if (n.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
