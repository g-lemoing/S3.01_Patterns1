package nivell2.country_factory;

import nivell2.country_implementation.PortugalAddress;
import nivell2.country_implementation.PortugalPhone;
import nivell2.interfaces.Address;
import nivell2.interfaces.AgendaFactory;
import nivell2.interfaces.Phone;
import nivell2.main.AgendaEntry;

public class PortugalAgenda implements AgendaFactory {

    @Override
    public Phone createPhone() {
        return new PortugalPhone();
    }

    @Override
    public Address createAddress() {
        return new PortugalAddress();
    }
}
