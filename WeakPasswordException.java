public class WeakPasswordException {
    class InvalidPasswordException extends Exception {
        public InvalidPasswordException(String msg) {
            super(msg);
        }
    }
}
