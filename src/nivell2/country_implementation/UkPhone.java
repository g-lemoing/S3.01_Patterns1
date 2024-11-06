package nivell2.country_implementation;

import nivell2.interfaces.Phone;
import nivell2.main.Menu;

public class UkPhone implements Phone {
    private final static String PREFIX = "+44";
    private String number;

    @Override
    public void setPhone(String number) {
        final String REGEX_STR = "^[1-9][0-9]{9,10}$";
        if (Utilities.isValidPattern(number, REGEX_STR)){
            this.number = number;
        }else{
            throw new IllegalArgumentException("Error: el telèfon ha de contenir entre 10 i 11 digits i no començar per 0.");
        }
    }

    @Override
    public String askPhone() {
        final String REGEX_STR = "^[1-9][0-9]{9,10}$";
        final String MESSAGE = "Introdueix el telèfon sense prefix internacional, ha de ser de 10 o 11 dígits: ";
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
