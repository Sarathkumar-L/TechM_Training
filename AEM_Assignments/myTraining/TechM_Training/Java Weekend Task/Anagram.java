import java.util.*;

public class PermutationMatcher {
    public static List<Integer> locatePermutations(String text, String pattern) {
        List<Integer> indices = new ArrayList<>();
        if (text.length() < pattern.length())
            return indices;

        int[] patternFreq = new int[26];
        int[] textFreq = new int[26];

        for (char c : pattern.toCharArray())
            patternFreq[c - 'a']++;

        for (int i = 0; i < text.length(); i++) {
            textFreq[text.charAt(i) - 'a']++;

            if (i >= pattern.length())
                textFreq[text.charAt(i - pattern.length()) - 'a']--;

            if (Arrays.equals(patternFreq, textFreq))
                indices.add(i - pattern.length() + 1);
        }

        return indices;
    }

    public static void main(String[] args) {
        System.out.println(locatePermutations("bcaedcbacd", "bca"));
        System.out.println(locatePermutations("cdcd", "dc"));
    }
}
