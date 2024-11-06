package nivell2.country_implementation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilities {
    public static boolean isValidPattern (String number, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
