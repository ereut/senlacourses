package by.ereut.senlacourses.task1;

import lombok.AllArgsConstructor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@AllArgsConstructor
public class DuplicateSymbolCounter {

    private static final String regExp = "(.)\\1{2}";
    private final String enteredString;

    public int countMatches() {
        int value = 0;
        final Matcher matcher = Pattern.compile(regExp).matcher(enteredString);
        while(matcher.find()) {
            value++;
        }
        return value;
    }

}
