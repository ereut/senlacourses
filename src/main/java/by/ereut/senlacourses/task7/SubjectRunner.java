package by.ereut.senlacourses.task7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SubjectRunner {

    private final static String fullFileName = "src/main/resources/subjects.csv";


    public static void main(String[] args) {
        List<Subject> fullSubjectList = new LinkedList<>();
        try (Scanner scanner = new Scanner(new FileReader(fullFileName))) {
            while(scanner.hasNext()) {
                fullSubjectList.add(SubjectFactory.getSubjectFromFactory(scanner.nextLine()));
            }
            System.out.println("Please enter the volume of the safe");
            Scanner consoleScanner = new Scanner(System.in);
            final int safeVolume = consoleScanner.nextInt();
            System.out.println("Input data :");
            Subjects.printSubjectList(fullSubjectList);
            System.out.println("Safe volume is " + safeVolume);
            final SubjectService subjectService =
                    new SubjectService(fullSubjectList, Safe.builder().maxVolume(safeVolume).build());
            subjectService.fillTheSafe();
            System.out.println("Subjects in safe are:");
            Subjects.printSubjectList(subjectService.getSafe().getSafeSubjectList());
            System.out.println("Safe volume is " + safeVolume);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }

}
