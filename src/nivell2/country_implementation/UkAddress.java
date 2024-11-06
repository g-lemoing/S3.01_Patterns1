package nivell2.country_implementation;

import nivell2.interfaces.Address;
import nivell2.main.Menu;

public class UkAddress implements Address {
    private final static String COUNTRY = "Regne Unit";
    private String street;
    private String streetNr;
    private String zipCode;
    private String city;

    @Override
    public void setAddress(String street, String streetNr, String zipCode, String city) {
        this.street = street;
        this.streetNr = streetNr;
        this.zipCode = zipCode;
        this.city = city;
    }

    @Override
    public String askStreet() {
        return Menu.askAddressElem("Entreu el nom del carrer: ");
    }

    @Override
    public String askStreetNr() {
        return Menu.askAddressElem("Entreu el número del carrer: ");
    }

    @Override
    public String askZipCode() {
        final String REGEX_STR = "^(GIR ?0AA|[A-Z]{1,2}[0-9]{1,2}?[0-9][A-Z]{2})$";
        String zipCode;
        do{
            zipCode = Menu.askAddressElem("Entreu el codi postal en format 'AA000AA': ");
        }
        while (!Utilities.isValidPattern(zipCode, REGEX_STR));
        return zipCode;
    }

    @Override
    public String askCity() {
        return Menu.askAddressElem("Entreu el nom de la població: ");
    }

    @Override
    public String toString() {
        return "Carrer: " + street +
                ", " + streetNr +
                ", Codi postal: " + zipCode +
                ", Població: " + city +
                ", País: " + COUNTRY;
    }

}
