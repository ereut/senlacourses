package by.ereut.senlacourses.task2;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Please, enter the string:");
        final Scanner scanner = new Scanner(System.in);
        final String enteredString = scanner.nextLine();
        final DigitsSumCounter counter = new DigitsSumCounter(enteredString);
        System.out.println("Sum of digits is " + counter.countDigitsSum());

    }
}
