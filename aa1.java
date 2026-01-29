public class aa1{

public static int fac(int n){
int result=1;
for(int i=1; i<=n;i++){
result *=i;
}
return result;
}

public static void main(String[]args){
int number=5;
int result=fac(number);
System.out.println("Factorial of "+number+" is "+result);
}

}