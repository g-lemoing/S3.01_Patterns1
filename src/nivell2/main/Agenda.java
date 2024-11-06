package nivell2.main;

import nivell2.country_factory.PortugalAgenda;
import nivell2.country_factory.SpainAgenda;
import nivell2.country_factory.UkAgenda;
import nivell2.interfaces.Address;
import nivell2.interfaces.Phone;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<AgendaEntry> entries = new ArrayList<>();

    public void addEntry (String country) {
        AgendaEntry agendaEntry = new AgendaEntry();
        Address address = null;
        Phone phone = null;
        String phoneNr;
        String street;
        String streetNr;
        String zipcode;
        String city;

        switch (country) {
            case "Espanya":
                phone = new SpainAgenda().createPhone();
                address = new SpainAgenda().createAddress();
                break;
            case "Portugal":
                phone = new PortugalAgenda().createPhone();
                address = new PortugalAgenda().createAddress();
                break;
            case "Regne Unit":
                phone = new UkAgenda().createPhone();
                address = new UkAgenda().createAddress();
                break;
            default:
                System.out.println("País no reconegut, s'anul·la l'entrada.");
        }

        if(phone != null){
            phoneNr = phone.askPhone();
            street = address.askStreet();
            streetNr = address.askStreetNr();
            zipcode = address.askZipCode();
            city = address.askCity();
            phone.setPhone(phoneNr);
            address.setAddress(street, streetNr, zipcode, city);
            agendaEntry.setPhone(phone);
            agendaEntry.setAddress(address);
            entries.add(agendaEntry);
            System.out.println("Nova entrada correctament afegida a l'agenda!");
        }
    }

    @Override
    public String toString() {
        return "" + entries;
    }

    public void listAgenda(){
        System.out.println("\nContactes desats a l'agenda:\n");
        for (AgendaEntry agendaEntry : this.entries){
            System.out.println(agendaEntry.toString());
        }
    }
}
