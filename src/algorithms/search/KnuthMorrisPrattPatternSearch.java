package algorithms.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/***
 * When we need to match String pattern in a given string, the brute-force algorithm
 * will be to match would be we will each character with each character of pattern
 * this way the complexity will be mupltiplication of lengths of both strings
 * To Improve this comlexity KMP has given idea that if we can find sufix and prefix of the
 * pattern then if any mismatch happens we don't need to go back to the start+1, instead we can skip the prefix which we have already
 * checked, hence it will improve complexity as we have to move iterator only of length of the pattern.
 *
 *
 */

public class KnuthMorrisPrattPatternSearch {

    private static int[] compilePatternArray( String pattern ) {
        int i = 1;
        int patternLen = pattern.length();
        int len = 0;
        int[] compiledPatternArray = new int[patternLen];
        compiledPatternArray[0] = 0;

        while (i < patternLen) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                compiledPatternArray[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = compiledPatternArray[len -1];
                } else  {
                    compiledPatternArray[i] = len;
                    i++;
                }
            }
        }

        System.out.println("Compiled Pattern Array " + Arrays.toString(compiledPatternArray));
        return compiledPatternArray;
    }

    private static List<Integer> performKMPSearch(String text, String pattern) {
        int[] compliedPatternArray = compilePatternArray(pattern);
        int textIndex =0;
        int patternIndex = 0;

        List<Integer> foundIndexes = new ArrayList<>();
        while (textIndex < text.length()) {
            if (pattern.charAt(patternIndex) == text.charAt(textIndex)) {
                patternIndex++;
                textIndex++;
            }
            if (patternIndex == pattern.length()) {
                foundIndexes.add(textIndex-patternIndex);
                patternIndex = compliedPatternArray[patternIndex -1];
            } else if (textIndex < text.length() && pattern.charAt(patternIndex)  != text.charAt(textIndex)) {
                if (patternIndex != 0){
                    patternIndex = compliedPatternArray[patternIndex -1];
                } else {
                    textIndex = textIndex + 1;
                }

            }

        }
        return foundIndexes;
    }

    public static void main(String[] args) {
//      String pattern = "AAABAAA";
//      String text = "ASBNSAAAAAABAAAAABAAAAAGAHUHDJKDDKSHAAJF";
        String pattern = "aabe";
        String text = "aabaacdeaaabe";

        List<Integer> foundIndexes = KnuthMorrisPrattPatternSearch.performKMPSearch(text, pattern);

        if (foundIndexes.isEmpty()) {
            System.out.println("Pattern not found in the given text String");
        } else {
            System.out.println("Pattern found in the given text String at positions: "+
                    foundIndexes.stream().map(Object::toString).collect(Collectors.joining(", ")));
        }
    }
    
}
