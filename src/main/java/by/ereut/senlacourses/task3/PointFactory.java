package by.ereut.senlacourses.task3;

public class PointFactory {
    private static String delimiter = ",";

    public static Point getPointFromFactory(String line) {
        final String[] coordinate = line.split(delimiter);
        return new Point(Long.parseLong(coordinate[0].replace("(", "")),
                Long.parseLong(coordinate[1].replace(")", "")));
    }

}
