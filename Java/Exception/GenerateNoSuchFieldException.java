import java.lang.reflect.Field;

class Sample {
    public int field1;
}

public class GenerateNoSuchFieldException {
    public static void main(String[] args) {
        try {
            Class<Sample> sampleClass = Sample.class;
            Field field = sampleClass.getDeclaredField("nonExistentField"); // This will generate NoSuchFieldException
        } catch (NoSuchFieldException e) {
            System.out.println("No Such Field Exception: " + e.getMessage());
        } catch (SecurityException e) {
            System.out.println("Security Exception: " + e.getMessage());
        }
    }
}
