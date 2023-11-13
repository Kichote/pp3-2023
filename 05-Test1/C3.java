public class C3 {
    
    // Static method to check if the letters in the text are in alphabetical order
    public static boolean isAlphabet(String t) {
        // Convert the string to lowercase to handle both upper and lower case letters
        t = t.toLowerCase();

        // Check if the letters are in alphabetical order
        for (int i = 0; i < t.length() - 1; i++) {
            if (t.charAt(i) > t.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }

    // Static method to hide all characters except the first and last characters with asterisks
    public static String hideText(String t) {
        if (t.length() <= 2) {
            return t; // No need to hide characters for strings with 2 or fewer characters
        }

        char firstChar = t.charAt(0);
        char lastChar = t.charAt(t.length() - 1);

        // Replace all characters between the first and last characters with asterisks
        StringBuilder hiddenText = new StringBuilder();
        hiddenText.append(firstChar);
        for (int i = 1; i < t.length() - 1; i++) {
            hiddenText.append('*');
        }
        hiddenText.append(lastChar);

        return hiddenText.toString();
    }

    public static void main(String[] args) {
        // Sample usage
        System.out.println("isAlphabet(\"abegsw\"): " + isAlphabet("abegsw"));
        System.out.println("isAlphabet(\"abcmhsw\"): " + isAlphabet("abcmhsw"));

        System.out.println("hideText(\"apple\"): " + hideText("apple"));
        System.out.println("hideText(\"ok\"): " + hideText("ok"));
    }
}