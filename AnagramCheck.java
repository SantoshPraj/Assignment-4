public class AnagramCheck {
    public static boolean isAnagram(String str1, String str2) {
        // Remove whitespace and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create an array to count character frequencies
        int[] charCount = new int[26];

        // Count frequencies of characters in str1
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            charCount[ch - 'a']++;
        }

        // Decrement frequencies of characters in str2
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            charCount[ch - 'a']--;
        }

        // Check if any frequency is non-zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input1 = "listen";
        String input2 = "silent";

        if (isAnagram(input1, input2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
