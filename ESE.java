public class ESE {
    public static void main(String[] args) {
       java.util.Stack stack = new java.util.Stack();
        
        try {
            stack.pop();
        } catch (java.util.EmptyStackException e) {
            System.out.println(e);
        }
        System.out.println("iam printed");
    }
}
