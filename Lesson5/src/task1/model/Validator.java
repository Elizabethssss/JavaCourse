package task1.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    Matcher matcher;
    Pattern pattern;
    String names = "([A-Z])([a-z])+";
    String birth = "(([0-2]\\d)|(3[0-1]))\\.((0[1-9])|(1[0-2]))\\.((19\\d{2})|(20[0-1]\\d))";
    String telephone = "\\+38\\(0\\d{2}\\)\\d{2}-\\d{2}-\\d{3}";
    String address = "([A-Z]*[a-z]+\\s)+\\d+\\w,\\sroom\\s\\d+";

    public boolean validateNames(String str, String category) {
        switch (category.toLowerCase()) {
            case "surname": pattern = Pattern.compile(names);
            case "name": pattern = Pattern.compile(names);
            case "birth": pattern = Pattern.compile(birth);
            case "telephone": pattern = Pattern.compile(telephone);
            case "address": pattern = Pattern.compile(address);
            default: break;
        }
        matcher = pattern.matcher(str);
        return matcher.matches();
    }

}
