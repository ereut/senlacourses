package by.ereut.senlacourses.task4;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Please, enter integer");
        final Scanner scanner = new Scanner(System.in);
        try {
            final int enteredInteger = scanner.nextInt();

        } catch (Exception ex) {
            System.out.println("Incorrect input data, please enter integer");
        }

    }

}
