public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[5] = 10; // This will generate ArrayIndexOutOfBoundsException
            int result = 10 / 0; // This will generate ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
    }
}
