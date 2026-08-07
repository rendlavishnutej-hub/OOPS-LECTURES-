import java.util.Scanner;

public class methostr {
    
    public static void main(String[] arg){
        
        


            String s1 ="pranay";
            String s2 = "pranay";
            String s3 = new String("pranay");
            String s4 = "PRANAY";
            if(s1.equals(s2)){
                System.out.println("s1 and s2 are equal");
            }
            else{
                System.out.println("s1 and s2 are not equal");
            }
            if(s1.equalsIgnoreCase(s3)){
                System.out.println("s1 and s3 are equal");
            }
            else{
                System.out.println("s1 and s3 are not equal");

            }
            if(s1==s2){
                System.out.println("s1 and s2 are equal");
            }
            else{
                System.out.println("s1 and s2 are not equal");
            }

            int x = s1.compareToIgnoreCase(s4);
            if(x==0){
                System.out.println("s1 and s4 are equal");
            }
            else{
                System.out.println("s1 and s4 are not equal");
            }
    }

    
}
