package kyu8;

/**
 * It's pretty straightforward.
 * Your goal is to create a function that removes the first and last characters of a string.
 * You're given one parameter, the original string. You don't have to worry with strings with less than two characters.
 */

public class RemoveFirstLastCharacter {
    public static void main(String[] args) {
        System.out.println("loquen".equals(RemoveChars.remove("eloquent")));
        System.out.println("ountr".equals(RemoveChars.remove("country")));
        System.out.println("erso".equals(RemoveChars.remove("person")));
        System.out.println("lac".equals(RemoveChars.remove("place")));
    }

    public static class RemoveChars {
        public static String remove(String str) {
            return (String) str.subSequence(1,str.length()-1);
        }
    }
}