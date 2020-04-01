package core.basesyntax;

public class Palindrome {
    public boolean isPalindrome(String text) {
        StringBuilder str = new StringBuilder(text.toLowerCase().replaceAll("\\W+", ""));
        return str.toString().equals(str.reverse().toString());
    }
}
