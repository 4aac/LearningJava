import java.util.HashSet;
import java.util.Set;

public class Main {

    public static boolean palindrome(String str) {
        if (str == null) return false;
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static boolean anagram(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) return false;
        int[] count = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            // Here we use the ASCII value as the key of a HashMap
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int c : count) if (c != 0) return false;
        return true;
    }

    public static boolean isogram(String str) {
        if (str == null) return false;
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!seen.add(c)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("radar"));
        System.out.println(anagram("fried", "fired"));
        System.out.println(isogram("asier"));
    }
}

