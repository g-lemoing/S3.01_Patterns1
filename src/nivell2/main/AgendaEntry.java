package nivell2.main;

import nivell2.interfaces.Address;
import nivell2.interfaces.Phone;

public class AgendaEntry {
    private Phone phone;
    private Address address;

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contacte: {" +
                " Telèfon: " + phone.toString() +
                ", Adreça: {" + address.toString() + "} }";
    }
}
