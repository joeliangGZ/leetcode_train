package org.example.simple;

public class isPalindrome {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrome isPalindrome = new isPalindrome();
        System.out.println(isPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(isPalindrome.isPalindrome("11012"));
    }
}
