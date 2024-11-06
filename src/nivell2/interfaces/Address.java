package nivell2.interfaces;

public interface Address {
    void setAddress(String street, String streetNr, String zipCode, String city);
    String askStreet();
    String askStreetNr();
    String askZipCode();
    String askCity();
}
