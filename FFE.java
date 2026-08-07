import java.util.*;
//file format exception only allows pdf files to be uploaded
class FFE extends Exception{
    public FFE(String message) {
        super(message);
    }


 
    public static void main(String []a) throws FFE {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name with extension");
        String fname = sc.nextLine();
        if (!fname.endsWith(".pdf")) {
            try {
                throw new FFE("File format exception: Only PDF files are allowed.");
            } catch (FFE e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("File uploaded successfully.");
        }

    }
}