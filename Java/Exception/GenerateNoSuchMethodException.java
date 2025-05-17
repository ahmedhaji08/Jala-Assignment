import java.lang.reflect.Method;

class Sample {
    public void method1() {}
}

public class GenerateNoSuchMethodException {
    public static void main(String[] args) {
        try {
            Class<Sample> sampleClass = Sample.class;
            Method method = sampleClass.getDeclaredMethod("nonExistentMethod"); // This will generate NoSuchMethodException
        } catch (NoSuchMethodException e) {
            System.out.println("No Such Method Exception: " + e.getMessage());
        } catch (SecurityException e) {
            System.out.println("Security Exception: " + e.getMessage());
        }
    }
}
