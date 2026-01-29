import java.util.*;
public class tt{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
ArrayList <Integer> al = new ArrayList<>();

System.out.println("Enter the size of the n0.:");
int a = input.nextInt();

System.out.println("ok, now enter the no.s");
for(int i=0; i<a ; i++){
al.add(input.nextInt());

}
double c=0;
//System.out.println("the array");
System.out.println(al);

for(int b:al){
 c = c+b;

}
double d=c/al.size();
System.out.println("mean: "+ d);

System.out.println("after sorting");
Collections.sort(al);
System.out.println(al);

 // Step 2: Find element closest to mean
        int closest = al.get(0);
        double minDiff = Math.abs(al.get(0) - d);

        for (int i = 1; i < al.size(); i++) {
            double diff = Math.abs(al.get(i) - d);
            if (diff < minDiff) {
                minDiff = diff;
                closest = al.get(i);
            }
        }
System.out.println(closest);

}

}