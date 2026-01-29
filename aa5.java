public class aa5{

public static int Fac(int n){

if (n <= 1){
return n + Fac(n+1);}
if(n>=21) return n;
return n+Fac(n+n);

}

public static void main(String[] args){
int number=0;
int result=Fac(number);
System.out.println("Factorial of"+ number+" is "+result);
}

}