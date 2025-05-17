class ExceptionThrower {
    public void throwException() throws Exception {
        throw new Exception("This is a thrown exception.");
    }
}

public class CallExceptionThrower {
    public static void main(String[] args) throws Exception { // Declare the exception
        ExceptionThrower obj = new ExceptionThrower();
        obj.throwException(); // This will now compile without error
    }
}
