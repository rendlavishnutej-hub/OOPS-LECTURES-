import java.util.*;
public class wpe {
    public static void main(String args[]) throws WeakPasswordException.InvalidPasswordException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = sc.nextLine();
       
        if (password.length() < 8) {
            throw new WeakPasswordException().new InvalidPasswordException("Password is too weak");
        } else {
            System.out.println("Password is strong");
        }
    }
}
