public class PangramCheck {
    public static boolean isPangram(String str) {
        // Remove whitespace and convert to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();

        // Create a boolean array to track presence of each alphabet
        boolean[] alphabetPresent = new boolean[26];

        // Iterate through the string characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character is an alphabet
            if (ch >= 'a' && ch <= 'z') {
                alphabetPresent[ch - 'a'] = true;
            }
        }

        // Check if all alphabets are present
        for (boolean present : alphabetPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";

        if (isPangram(input)) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }
}
