import java.util.*;
public class test{

public static void main(String [] args){

Stack <Character> stack = new Stack<>();
ArrayList<Character> ar = new ArrayList<>();
Scanner input = new Scanner(System.in);

char [] a = {'A','B','C','D','E','F'};

System.out.println("input the operations like [DRRDRDD]");
String b =input.nextLine().trim().toUpperCase();

//System.out.println("");
System.out.println(b);



for(int i=0; i<=b.length();i++){

 if (i < b.length()) {
 if(b == 'D'){
 stack.push(a[i]);
}
}


else if(i > b.length()){
if(b == 'R'){
if(!stack.isEmpty()){
stack.pop();
}
}
else {
System.out.println("Underflow");
}
}

System.out.println(stack);

}




}



}