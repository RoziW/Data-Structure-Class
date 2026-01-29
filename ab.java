import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ab{
public static void main(String[] args){
Set<String> names= new HashSet<String>();

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
System.out.print("");
}
System.out.println("");

}
}