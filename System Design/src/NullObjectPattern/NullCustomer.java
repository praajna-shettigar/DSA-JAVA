package NullObjectPattern;

// NullCustomer class representing a non-existent customer
class NullCustomer implements Customer {
    @Override
    public String getName() {
        return "Not Available";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
