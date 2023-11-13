public class Alphabet {
    
    public static void main(String[] args) {
        String text1 = "abegsw";
        String text2 = "abcmhsw";
        String text3 = "world";

        System.out.println("Is '" + text1 + "' in alphabetical order? " + isAlphabet(text1));
        System.out.println("Is '" + text2 + "' in alphabetical order? " + isAlphabet(text2));
        System.out.println("Is '" + text3 + "' in alphabetical order? " + isAlphabet(text3));
    }

    public static boolean isAlphabet(String text) {
        if (text == null || text.length() <= 1) {
            return true;
        }

        text = text.toLowerCase();

        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) > text.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
