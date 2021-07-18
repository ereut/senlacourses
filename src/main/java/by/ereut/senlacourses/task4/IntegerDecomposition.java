package by.ereut.senlacourses.task4;

import lombok.AllArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
public class IntegerDecomposition {

    private int inputInteger;

    public void printPrimeFactors() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int n = 2; n <= inputInteger; n++) {
            while (inputInteger % n == 0) {
                list.add(n);
                inputInteger /= n;
            }
        }
        for (int n : list) {
            System.out.println(n);
        }
    }

}
