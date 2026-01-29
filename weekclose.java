import java.util.Scanner;
import java.util.ArrayList;

public class weekclose{
public static void main (String []args){
System.out.println("Enter your numbers use , comma to separate the numbers: ");
Scanner input=new Scanner(System.in);
String x=input.nextLine();
String [] num= x.split(",");
ArrayList <Integer> number=new ArrayList<Integer>();

for (int i=0 ; i<num.length ; i++){
number.add(Integer.parseInt(num[i].trim()));

}
int sum=0;


for (int i=0 ; i<number.size(); i++){
sum+=number.get(i);

}
double avg=sum/number.size();

int closest=number.get(0);
double firstDiff=Math.abs (number.get(0)-avg);

for (int i=0 ; i<number.size(); i++){
double secondDiff=Math.abs (number.get(i)-avg);

if(secondDiff<firstDiff){
closest=number.get(i);
firstDiff=secondDiff;

}

}
System.out.println("Avg is : "+avg);


System.out.println("Closest is : "+closest);

}

}