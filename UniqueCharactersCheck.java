public class UniqueCharactersCheck {
    public static boolean hasUniqueCharacters(String str) {
        // Create a boolean array to track character occurrences
        boolean[] charOccurrence = new boolean[256];

        // Iterate through the characters of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character has already occurred
            if (charOccurrence[ch]) {
                return false;
            }

            // Mark character occurrence as true
            charOccurrence[ch] = true;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "abcdefg";

        if (hasUniqueCharacters(input)) {
            System.out.println("The string contains all unique characters.");
        } else {
            System.out.println("The string does not contain all unique characters.");
        }
    }
}
