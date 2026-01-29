public class FactorialIterativeData {

    // Iterative factorial method
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 20;  // Change as needed
        Runtime runtime = Runtime.getRuntime();

        // Memory before
        long startMemory = runtime.totalMemory() - runtime.freeMemory();
        long startTime = System.nanoTime();

        long result = factorial(number);

        long endTime = System.nanoTime();
        long endMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Iterative Factorial of " + number + " is " + result);
        System.out.println("Time taken (ns): " + (endTime - startTime));
        System.out.println("Approx. memory used (bytes): " + (endMemory - startMemory));
    }
}
