import java.util.*;

public class throwDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
       int a = scanner.nextInt();
       int b = scanner.nextInt();
       if(b<=0){
        throw new ArithmeticException("This number is not allowed");
       }
       else{
        System.out.println("no problem");
       }
       System.out.println("iam printed");
       
    }
}