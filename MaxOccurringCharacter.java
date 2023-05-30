public class MaxOccurringCharacter {
    public static char getMaxOccurringCharacter(String str) {
        // Create an array to track character frequencies
        int[] charCount = new int[256];

        // Iterate through the characters of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Increment the frequency of the character
            charCount[ch]++;
        }

        int maxCount = 0;
        char maxChar = ' ';

        // Find the character with maximum frequency
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                maxChar = (char) i;
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        String input = "Hello World";

        char maxChar = getMaxOccurringCharacter(input);

        System.out.println("The maximum occurring character is: " + maxChar);
    }
}
