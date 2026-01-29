public class aa2{

public static long fac(int n){
if (n <=1) return 1;
return n * fac(n-1);
}

public static void main(String [] args){
int no=20;
Runtime runtime = Runtime.getRuntime();

//mem b4
long startMemory = runtime.totalMemory() - runtime.freeMemory();
long startTime = System.nanoTime();

long result = fac(no);

long endTime = System.nanoTime();
long endMemory = runtime.totalMemory() - runtime.freeMemory();

//System.out.println();
System.out.println("Recursive factorial of "+no+" is "+result);
System.out.println("Time taken (ns): "+(endTime - startTime));
System.out.println("Approx. memory used(bytes): "+ (endMemory - startMemory));


}

}