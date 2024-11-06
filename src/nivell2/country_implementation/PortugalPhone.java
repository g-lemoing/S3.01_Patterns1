package nivell2.country_implementation;

import nivell2.interfaces.Phone;
import nivell2.main.Menu;

public class PortugalPhone implements Phone {
    private final static String PREFIX = "+351";
    private String number;

    @Override
    public void setPhone(String number) {
        this.number = number;
    }

    @Override
    public String askPhone() {
        final String REGEX_STR = "^[1-9][0-9]{8}$";
        final String MESSAGE = "Introdueix el telèfon sense prefix internacional, ha de ser de 9 dígits: ";
        String phone;
        do{
            phone = Menu.askPhone(MESSAGE);
        }
        while (!Utilities.isValidPattern(phone, REGEX_STR));
        return phone;
    }

    @Override
    public String toString() {
        return PREFIX + " " + number;
    }
}
