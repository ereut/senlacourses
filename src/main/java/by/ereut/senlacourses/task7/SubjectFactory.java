package by.ereut.senlacourses.task7;

public class SubjectFactory {

    private static final String delimiter = ";";

    public static Subject getSubjectFromFactory(String line) {
        String values[] = line.split(delimiter);
        return new Subject(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]));
    }



}
