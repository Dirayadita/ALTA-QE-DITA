public class Palindrome {
    public static void main(String[] args) {
        String original = "kodok";

        String reverse = "";
        for(int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
            System.out.println(reverse);
        }

        boolean palindrome = true;
        for(int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }
        if(palindrome) {
            System.out.println("Ini adalah kata Palindrome!");
        } else  {
            System.out.println("Maaf, ini bukan kata Palindrome!");
        }
    }
}