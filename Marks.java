import java.util.*;

class InvalidMarksExceptin extends Exception {
    public InvalidMarksExceptin(String msg) {
        super(msg);
    }
}

public class Marks {
    public static void main(String args[]) throws InvalidMarksExceptin {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int x = sc.nextInt();

        if (x < 0 || x > 100) {
            throw new InvalidMarksExceptin("Marks can't be negative or above total marks");
        } else {
            System.out.println("Your marks are: " + x);
        }
    }
}
