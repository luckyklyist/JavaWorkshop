class Address {
    private String street;
    private String city;
    private String zipCode;

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Address() {
        this.street = "123 Main St";
        this.city = "New York";
        this.zipCode = "10001";
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}

public class ZipCode {
    public static void main(String[] args) {
        Address address = new Address();

        address.setStreet("123 Main St");
        address.setCity("New York");
        address.setZipCode("10001");

        System.out.println("Street: " + address.getStreet());
        System.out.println("City: " + address.getCity());
        System.out.println("Zip Code: " + address.getZipCode());
    }
}
