public class aa7 {

    public static int calc(int n) {
       
        if (n == 0) {
            return 0;
        }
        
        else if (n == 1) {
            return 1;
        }
        
                else {
            return calc(n - 1) + calc(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 8; 
        System.out.println("The " + n + "th number is: " + calc(n));

        
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(calc(i) + " ");
        }
        System.out.println();
    }
}