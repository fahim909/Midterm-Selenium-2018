package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        int max = 0;
        String word = null;

        for (Map.Entry entry: wordNLength.entrySet()) {
            if ((int)entry.getKey() > max){
                max = (int)entry.getKey();
                word = (String) entry.getValue();
            }
        }
        System.out.println(max +" "+ word);
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement
        String[] arr = wordGiven.split(" ");
        for (String str: arr) {

            if (map.get(str) == null){
                map.put(str.length(),str);
            }

        }

        return map;
    }
}