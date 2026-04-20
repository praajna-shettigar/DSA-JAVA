import java.text.NumberFormat;
import java.util.*;

public class WordsToNumber {
    public static void main(String[] args) {
        String input = "i have one crore five lakh twenty thousand rupee in account";
        String result = convertSentence(input);
        System.out.println(result);
    }

    static String convertSentence(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("ten", 10);
        map.put("twenty", 20);
        map.put("thirty", 30);
        map.put("forty", 40);
        map.put("fifty", 50);
        map.put("sixty", 60);
        map.put("seventy", 70);
        map.put("eighty", 80);
        map.put("ninety", 90);
        map.put("hundred", 100);
        map.put("thousand", 1000);
        map.put("lakh", 100000);
        map.put("crore", 10000000);

        String[] words = sentence.split(" ");
        long number = 0;
        long tempNum = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String w = words[i].toLowerCase();

            if (map.containsKey(w)) {
                int val = map.get(w);
                if (val < 100) {
                    tempNum += val;
                } else {
                    if (val >= 1000) {
                        tempNum *= val;
                        number += tempNum;
                        tempNum = 0;
                    } else {
                        tempNum *= val; // for hundred
                    }
                }
            } else {
                // When we reach a non-number word, check if we have a number built
                if (tempNum > 0 || number > 0) {
                    number += tempNum;
                    tempNum = 0;
                    // Format Indian style
                    NumberFormat nf = NumberFormat.getInstance(new Locale("en", "IN"));
                    result.append(nf.format(number)).append(" ");
                    number = 0;
                }
                result.append(words[i]).append(" ");
            }
        }

        // If the sentence ends with number words
        if (tempNum > 0 || number > 0) {
            number += tempNum;
            NumberFormat nf = NumberFormat.getInstance(new Locale("en", "IN"));
            result.append(nf.format(number));
        }

        return result.toString().trim();
    }
}
