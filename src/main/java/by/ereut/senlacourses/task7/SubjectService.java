package by.ereut.senlacourses.task7;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class SubjectService {

    private List<Subject> fullSubjectList;
    private Safe safe;

    public void fillTheSafe() {
        fullSubjectList.sort(new SubjectComparator());
        final List<Subject> safeList = new ArrayList<>();
        safe.setSafeSubjectList(safeList);

        for (Subject subject : fullSubjectList) {
            final int fullness = safe.getSafeFullness();
            if (fullness < safe.getMaxVolume()) {
                if (subject.getVolume() <= safe.getFreeVolume()) {
                    safe.addSubject(subject);
                }
            }
        }

    }

}
