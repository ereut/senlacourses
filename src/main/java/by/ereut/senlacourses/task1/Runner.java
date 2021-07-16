package by.ereut.senlacourses.task1;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Please, enter the string");
        final Scanner scanner = new Scanner(System.in);
        final String enteredString = scanner.nextLine();
        final DuplicateSymbolCounter counter = new DuplicateSymbolCounter(enteredString);
        System.out.print(counter.countMatches());

    }
}
