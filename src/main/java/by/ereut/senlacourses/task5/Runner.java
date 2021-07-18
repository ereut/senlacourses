package by.ereut.senlacourses.task5;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Please, enter the sentence");
        final Scanner scanner = new Scanner(System.in);
        final String sentence = scanner.nextLine();
        SentenceUtils.sortingWords(sentence);
    }
}
