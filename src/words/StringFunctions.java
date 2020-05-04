package words;

import utils.Constants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFunctions {

    public Word getLongestWord(String s) {
        Word longestWord = new Word("", 0);
        if (s == null || s.length() == 0) {
            return longestWord;
        }
        Pattern pattern = Pattern.compile(Constants.VALID_WORD_PATTERN);
        String[] words = s.split(" ");
        long max = 0;
        String longest = "";
        for (int i = 0; i < words.length; i++) {
            String w = words[i].trim().replaceAll("[,.;:!?]", "");
            Matcher matcher = pattern.matcher(w);
            if (matcher.find()) {
                long currentMax = w.length();
                if (currentMax > max) {
                    max = currentMax;
                    longest = w;
                }
            }
        }
        longestWord.setWord(longest);
        longestWord.setLength(max);
        return longestWord;
    }

    public Word getShortestWord(String s) {
        Word shortestWord = new Word("", 0);
        if (s == null || s.length() == 0) {
            return shortestWord;
        }
        Pattern pattern = Pattern.compile(Constants.VALID_WORD_PATTERN);
        String[] words = s.split(" ");
        long min = Integer.MAX_VALUE;
        String shortest = "";
        for (int i = 0; i < words.length; i++) {
            String w = words[i].trim().replaceAll("[,.;:|!]", "");
            Matcher matcher = pattern.matcher(w);
            if (matcher.find()) {
                long currentMin = w.length();
                if (currentMin < min) {
                    min = currentMin;
                    shortest = w;
                }
            }
        }
        shortestWord.setWord(shortest);
        shortestWord.setLength(min);
        return shortestWord;
    }

}
