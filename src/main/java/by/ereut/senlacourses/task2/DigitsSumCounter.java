package by.ereut.senlacourses.task2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DigitsSumCounter {

    private final String enteredString;

    public long countDigitsSum() {

        long sum = 0;
        for (int i = 0; i < enteredString.length(); i++) {
            final char ch = enteredString.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Integer.parseInt(String.valueOf(ch));
            }
        }

        return sum;
    }

}
