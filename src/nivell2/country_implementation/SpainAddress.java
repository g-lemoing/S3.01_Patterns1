package nivell2.country_implementation;

import nivell2.interfaces.Address;
import nivell2.main.Menu;

public class SpainAddress implements Address {
    private final static String COUNTRY = "Espanya";
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
        final String REGEX_STR = "^(?:0[1-9]\\d{3}|[1-4]\\d{4}|5[0-2]\\d{3})$";
        String zipCode;
        do{
            zipCode = Menu.askAddressElem("Entreu el codi postal de 5 dígits, entre '01000' i '52999': ");
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
