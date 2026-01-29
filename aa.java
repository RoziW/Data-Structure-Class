public class aa{

public static int Fac(int n){

if (n <= 1){
return 1;}

return n * Fac(n-1);

}

public static void main(String[] args){
int number=5;
int result=Fac(number);
System.out.println("Factorial of"+ number+" is "+result);
}

}