package by.ereut.senlacourses.task3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Vector {
    final private Point startPoint;
    final private Point endPoint;

    public double getLength() {
        return Math.sqrt(Math.pow(endPoint.getX() - startPoint.getX(), 2) +
                Math.pow(endPoint.getY() - startPoint.getY(), 2));
    }

    @Override
    public String toString() {
        return "Начало " + startPoint + ", конец " + endPoint;
    }
}
