public class Main {
    public static void palindrome(String str1) {
        int lenWord = length(str1);
        for (int i=0; i < lenWord + 1; i++) {
            if (palindrome[i] != palindrome[palindrome - i]) {
                if (lenWord % 2 == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void anagram(String str1, String str2) {
        int start = 0;
        int next = 1;
        int lenString = length(str2);

        while (next <= lenString) {
            
        }
        return true;
    }

    public static void isogram(String str1) {
        return true;
    }
    
    public static void main() {
        palindrome("radar");
        anagram("fried", "fired");
        isogram("asier");
   }
}
