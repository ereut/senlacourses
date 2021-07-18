package by.ereut.senlacourses.task3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class VectorRunner {

    private final static String fullFileName = "src/main/resources/vectors.txt";

    public static void main(String[] args) {
        ArrayList<String> points = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileReader(fullFileName))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                points.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fie with input data is not found");;
        }
        final Vector fVector = new Vector(
                PointFactory.getPointFromFactory(points.get(0)),
                PointFactory.getPointFromFactory(points.get(1))
        );
        final Vector sVector = new Vector(
                PointFactory.getPointFromFactory(points.get(2)),
                PointFactory.getPointFromFactory(points.get(3))
        );
        System.out.println("The length of the first vector is " + fVector.getLength());
        System.out.println("The length of the second vector is " + sVector.getLength());

    }
}
