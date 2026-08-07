public class palindrome {
    public static void main(String[] args) {

        // String reverse java methods lo ledhu

        String str = "madam";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equalsIgnoreCase(rev)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
        System.out.println(str.length());
        char[] ch = str.toCharArray();
        System.out.println(ch.length);

        for(char c : ch){
            System.out.println(c);
            
        }
    }
}
