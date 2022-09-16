//A subsequence of a string is a sequence that can be derived from the given string by deleting zero or more elements without changing the order of the remaining elements.

public class subsequences {

    public static void sub(String str, int idx, String newString) {

        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(idx);

        // to be
        sub(str, idx + 1, newString + currentChar);

        // not to be
        sub(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";

        sub(str, 0, "");
    }
}
