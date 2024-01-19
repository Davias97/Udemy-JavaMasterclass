public class Customer {

    private String name;
    private double creditLimit;
    private String address;

    public Customer() {
        this("Loktar", "Ogar");
    }

    public Customer(String name, String address) {
        this(name, 50.0, address );
    }

    public Customer(String name, double creditLimit, String address) {

        this.name = name;
        this.creditLimit = creditLimit;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getAddress() {
        return address;
    }
}
