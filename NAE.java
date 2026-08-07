public class NAE {
    public static void main(String[] args) {
         java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        try
        {
            int x[] = new int[n];

        }
        catch(NegativeArraySizeException e)
        {
            System.out.println(e);
        }
        System.out.println("iam printed");
    }
}
