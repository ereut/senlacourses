package by.ereut.senlacourses.task7;

import java.util.Comparator;

public class SubjectComparator implements Comparator<Subject> {

    @Override
    public int compare(Subject o1, Subject o2) {
        return -((o1.getValue() - o1.getVolume()) - (o2.getValue() - o2.getVolume()));
    }


}
