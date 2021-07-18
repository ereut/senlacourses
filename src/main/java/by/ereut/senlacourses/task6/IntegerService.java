package by.ereut.senlacourses.task6;

import com.google.common.base.Strings;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IntegerService {

    private static final String fileExtension = ".txt";
    private static final String filePathPrefix = "src/main/resources/";
    private static final int digitWidth = 5;
    private static final char sign = '#';


    public static void printConsole(String enteredInteger) {
        final char[] charAr = enteredInteger.toCharArray();
        final List<List<String>> resultList = new ArrayList<>();
        final char max = getMax(charAr);
        for (int i = 0; i < charAr.length; i++) {
            readNumberIntoList(resultList, charAr[i], i, isChange(max, charAr[i]));
        }
        printArray(resultList);
    }

    private static boolean isChange(char max, char ch) {
        return max == ch;
    }

    private static String makeFileNameFromCh(char ch) {
        return filePathPrefix + ch + fileExtension;
    }

    private static char getMax(char[] chArray) {

        final char[] copy = Arrays.copyOf(chArray, chArray.length );
        Arrays.sort(copy);
        return copy[copy.length -1];
    }

    private static void readNumberIntoList(List<List<String>> resultList, char ch, int position, boolean isChange) {

        try (Scanner scanner = new Scanner(new FileReader(makeFileNameFromCh(ch)))) {
            int count = 0;
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (isChange) {
                    line = line.replace(sign, ch);
                }
                if (line.length() < digitWidth) {
                    line = Strings.padEnd(line, digitWidth, ' ');
                }
                if (position == 0) {
                    final List<String> list = new ArrayList<>();
                    list.add(line);
                    resultList.add(list);
                } else {
                    resultList.get(count).add(line);
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Illegal input data " + ch);
        }
    }

    private static void printArray(List<List<String>> printingList) {
        for (List<String> list : printingList) {
            for (String str : list) {
                System.out.print(str);
            }
            System.out.println();
        }
    }

}
