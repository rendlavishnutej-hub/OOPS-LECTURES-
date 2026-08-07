import java.util.*;
public class MME {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
        System.out.println("iam printed");

    }
}
