public class aa3 {

    public static long fac(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int no = 20;
        Runtime runtime = Runtime.getRuntime();

        long startMemory = runtime.totalMemory() - runtime.freeMemory();
        long startTime = System.nanoTime();

        long result = fac(no);

        long endTime = System.nanoTime();
        long endMemory = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Iterative factorial of " + no + " is " + result);
        System.out.println("Time taken (ns): " + (endTime - startTime));
        System.out.println("Approx. memory used(bytes): " + (endMemory - startMemory));
    }
}
