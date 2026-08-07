import java.util.*;

class NFE 
{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try{
            int x = Integer.parseInt(s);
        }
        catch(NumberFormatException e){
            System.out.println(e);
            
        }
       System.out.println("iam printed");
       
    }
}