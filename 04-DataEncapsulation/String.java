public class String {

    public static void main(String[] args) {

        // Examining Individual Characters:
        char firstChar = myString.charAt(0);

        // Comparing Strings:
        boolean isEqual = str1.equals(str2);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);

        // Searching Strings:
        int index = myString.indexOf('a');
        int lastIndex = myString.lastIndexOf('a');

        // Extracting Substrings:
        String subString1 = myString.substring(3);
        String subString2 = myString.substring(0, 4);

        // Creating a Copy with Uppercase or Lowercase:
        String upperCaseString = myString.toUpperCase();
        String lowerCaseString = myString.toLowerCase();

        // Given text
        String text = "Have a nice day!";

        // Calculate and display the number of characters
        int numberOfCharacters = text.length();
        System.out.println("Number of characters: " + numberOfCharacters);

        // Display the first 9 characters
        String firstNineCharacters = text.substring(0, Math.min(9, text.length()));
        System.out.println("First 9 characters: " + firstNineCharacters);

        // Check if the text ends with the suffix "day!"
        boolean endsWithDay = text.endsWith("day!");
        System.out.println("Ends with 'day!': " + endsWithDay);

        // Check if the text is not empty
        boolean isNotEmpty = !text.isEmpty();
        System.out.println("Is not empty: " + isNotEmpty);

        // Index of the last occurrence of the character 'e'
        int lastIndexOfE = text.lastIndexOf('e');
        System.out.println("Last index of 'e': " + lastIndexOfE);

        // Replace spaces with minus signs
        String replacedText = text.replace(' ', '-');
        System.out.println("Text with spaces replaced: " + replacedText);

        // Convert the text to upper case
        String upperCaseText = text.toUpperCase();
        System.out.println("Text in upper case: " + upperCaseText);
    }
}