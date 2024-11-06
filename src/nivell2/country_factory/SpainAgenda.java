package nivell2.country_factory;

import nivell2.country_implementation.SpainAddress;
import nivell2.country_implementation.SpainPhone;
import nivell2.interfaces.Address;
import nivell2.interfaces.AgendaFactory;
import nivell2.interfaces.Phone;
import nivell2.main.AgendaEntry;

public class SpainAgenda extends AgendaEntry implements AgendaFactory {

    @Override
    public Phone createPhone() {
        return new SpainPhone();
    }

    @Override
    public Address createAddress() {
        return new SpainAddress();
    }
}
