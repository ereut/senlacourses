package by.ereut.senlacourses.task7;

import java.util.List;

public class Subjects {

    public static void printSubjectList(List<Subject> subjects) {
        System.out.printf("|%15s|%15s|%15s|%n","title", "value", "volume");
        subjects.forEach(subject -> System.out.printf("|%15s|%15d|%15d|%n",
                subject.getTitle(), subject.getValue(), subject.getVolume() ));
        System.out.printf("|%15s|%15d|%15d|%n",
                "Total",
                subjects.stream().mapToInt(Subject::getValue).sum(),
                subjects.stream().mapToInt(Subject::getVolume).sum());
    }


}
