package nivell2.country_factory;

import nivell2.country_implementation.SpainAddress;
import nivell2.country_implementation.SpainPhone;
import nivell2.interfaces.Address;
import nivell2.interfaces.AgendaFactory;
import nivell2.interfaces.Phone;

public class SpainAgenda implements AgendaFactory {

    @Override
    public Phone createPhone() {
        return new SpainPhone();
    }

    @Override
    public Address createAddress() {
        return new SpainAddress();
    }
}
