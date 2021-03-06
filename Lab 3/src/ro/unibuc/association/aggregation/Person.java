package ro.unibuc.association.aggregation;

public class Person {

    private String name;
    private Address homeAddress;

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Address address = new Address("County Road", "France");

        Person madeleine = new Person("Madeleine Jefferson");
        madeleine.setHomeAddress(address);

        System.out.println(madeleine);
    }

    @Override
    public String toString() {
        return "Person Information: " +  "Name: '" + name + '\'' +  "; Home Address: " + homeAddress;
    }

    public void setHomeAddress(Address address) {
        this.homeAddress = address;
    }

}

class Address {

    private final String street;
    private final String country;

    public Address(String street, String country) {
        this.street = street;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Street: '" + street + '\'' + "; Country: '" + country + '\'';
    }

}
