public class MULTI {
    public static void main(String args[]){
        try{
            int a = 10/0;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println("exception1: " + e);

            try {
                int x[] = new int[3];
                x[10] =40;

            }
            catch(ArrayIndexOutOfBoundsException e1){
                System.out.println("exception2: " + e1);

                try{
                    String s = null;
                    System.out.println(s.length());              
                  }

                catch(NullPointerException e2){
                    System.out.println("exception3: " + e2);
                }
            }

        }
        finally{
            System.out.println("iam printed");
        }
        System.out.println("i too got executed");
    }
}
