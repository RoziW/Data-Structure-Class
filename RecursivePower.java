public class RecursivePower {

    // Recursive method to calculate x^n
    public static double power(double x, int n) {
        // Base case: anything to the power of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: positive exponent
        if (n > 0) {
            return x * power(x, n - 1);
        }
        // Recursive case: negative exponent
        else {
            return 1 / power(x, -n);
        }
    }

    public static void main(String[] args) {
        double base = 5;
        int exponent = 3;

        double result = power(base, exponent);

        System.out.println(base + " raised to the power " + exponent + " is " + result);
    }
}


