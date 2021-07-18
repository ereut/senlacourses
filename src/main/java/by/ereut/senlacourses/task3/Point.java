package by.ereut.senlacourses.task3;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Point {
    private long x;
    private long y;

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
