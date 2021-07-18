package by.ereut.senlacourses.task5;

import lombok.AllArgsConstructor;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@AllArgsConstructor
public class SentenceUtils {

    private static final String delimiter = " ";
    private static String regExp = "[aeiouyаеёиоуыэюя]";

   public static void sortingWords (String sentence) {
       Map<Integer, List<String>> sortingWordsMap =
               new TreeMap<>(Collections.reverseOrder());

       for (String word : sentence.split(delimiter)) {
           final Matcher matcher =
                   Pattern.compile(regExp, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE).matcher(word);
           int count = 0;
           while (matcher.find()) {
               final String group = matcher.group();
               if (count == 0) {
                   word = word.replaceFirst(group, group.toUpperCase());
               }
               count++;
           }
           insertWordIntoMap(sortingWordsMap, count, word );
       }
       printMap(sortingWordsMap);
   }

   private static void insertWordIntoMap(Map<Integer, List<String>> map, Integer count, String word) {
       if (map.containsKey(count)) {
           List<String> list = map.get(count);
           list.add(word);
       } else {
           List<String> list = new ArrayList<>();
           list.add(word);
           map.put(count, list);
       }
   }

   public static void printMap(Map<Integer, List<String>> map) {
       for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
           System.out.println("Number of vowels -> " + entry.getKey() + " list of words -> " + entry.getValue());
       }
   }

}
