// MathOps.java
public class MathOps {
    static {
        System.loadLibrary("mathops"); // Load DLL named libmathops.so
    }

    // Declare native method
    public native int add(int a, int b);

    public static void main(String[] args) {
        MathOps obj = new MathOps();
        int result = obj.add(5, 3);
        System.out.println("Result: " + result);
    }
}
