public class Palindrome {
    public static void main(String[] args) {
        //string to be checked if palindrome
        String original = "mum";

        //eliminate spaces
        original = original.replace(" ", "");

        String reverse = "";
        for(int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }

        boolean palindrome = true;
        for(int i = 0; i < original.length(); i++) {
            if(original.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }

        if(palindrome) {
            System.out.println("The string entered is a palindrome!");
        } else {
            System.out.println("The string entered is NOT a palindrome.");
        }
    }
}