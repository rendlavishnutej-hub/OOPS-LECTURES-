public class MULTI2 {
    public static void main(String args[]){
        
        try {
            System.out.println("level1");
            try{
                System.out.println("level2");
                try{
                    String s = null;
                    System.out.println(s.length());
                }
                catch(NullPointerException e){
                    System.out.println("exception1: " + e);
                }
            }
            catch(ArrayIndexOutOfBoundsException e1){
                System.out.println("exception2: " + e1);
            }
        }
        catch(ArithmeticException e2){
            System.out.println("exception3: " + e2);
        }
        finally{
            System.out.println("iam printed");
        }
        System.out.println("i too got executed");
    }
    
}
