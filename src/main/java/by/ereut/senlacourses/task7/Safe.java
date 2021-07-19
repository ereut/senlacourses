package by.ereut.senlacourses.task7;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Safe {

    private int maxVolume;
    private List<Subject> safeSubjectList;

    public void addSubject(Subject subject) {
        safeSubjectList.add(subject);
    }

    public int getSafeFullness() {
        return safeSubjectList.stream().mapToInt(Subject::getVolume).sum();
    }

    public int getFreeVolume () {
        return maxVolume - getSafeFullness();
    }

}
