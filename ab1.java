import java.util.TreeSet;
import java.util.Set;

public class ab1{
public static void main(String[] args){
Set<String> names = new TreeSet<String>();

names.add("Rozi");
names.add("vjwbv");
names.add("rozyar");
names.add("kfwqlfn");

print(names);


}

private static void print(Set<String> s){
System.out.print("{");
for(String x: s){
System.out.print(x);
System.out.print(", ");
}
System.out.println("}");



}



}