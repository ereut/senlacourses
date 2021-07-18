package by.ereut.senlacourses.task6;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Please, enter the integer");
        final Scanner scanner = new Scanner(System.in);
        final String enteredString = scanner.nextLine();
        IntegerService.printConsole(enteredString);
    }

}
