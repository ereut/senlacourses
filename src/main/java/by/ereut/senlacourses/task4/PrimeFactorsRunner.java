package by.ereut.senlacourses.task4;

import java.util.Scanner;

public class PrimeFactorsRunner {

    public static void main(String[] args) {
        System.out.println("Please, enter integer");
        final Scanner scanner = new Scanner(System.in);
        try {
            final int enteredInteger = scanner.nextInt();
            new IntegerDecomposition(enteredInteger).printPrimeFactors();

        } catch (Exception ex) {
            System.out.println("Incorrect input data, please enter integer");
        }

    }

}
