public class aa6 {
    
    
    static long[] memo = new long[10]; 

    public static long fib(int n) {
        if (n <= 1) return n;


        if (memo[n] != 0) {
            return memo[n];
        }

    
        memo[n] = fib(n - 1) + fib(n - 2);
        
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(1));
    }
}