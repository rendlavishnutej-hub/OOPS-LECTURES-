public class StringIndexOutOfBoundsException extends Exception {
    //string index out of bounds exception

    public StringIndexOutOfBoundsException(String message) {
        super(message);
    }





public static void main(String[] args) throws StringIndexOutOfBoundsException {
    String str = "hello";
    char ch = str.charAt(0); 
    
    if( ch == '\0' ) {
        throw new StringIndexOutOfBoundsException("String index out of bounds: " + ch);
    }else {
        System.out.println("Character at index 0: " + ch);
    }

}
}