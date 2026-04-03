public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "test";
        if (isPalindrome(test)) {
            System.out.println(test + " is a palindrome.");
        } else {
            System.out.println(test + " is not a palindrome.");
        }
    }
}