package nivell2.country_factory;

import nivell2.country_implementation.UkAddress;
import nivell2.country_implementation.UkPhone;
import nivell2.interfaces.Address;
import nivell2.interfaces.AgendaFactory;
import nivell2.interfaces.Phone;

public class UkAgenda implements AgendaFactory {
    @Override
    public Phone createPhone() {
        return new UkPhone();
    }

    @Override
    public Address createAddress() {
        return new UkAddress();
    }
}
