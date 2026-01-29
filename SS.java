import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

public class SS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter operation sequence (S=push, O=pop): ");
        String ops = sc.nextLine().toUpperCase().trim();
        
        System.out.print("Enter input characters: ");
        String inputsStr = sc.nextLine().trim();
        ArrayList<Character> inputs = new ArrayList<>();
        for (char c : inputsStr.toCharArray()) {
            inputs.add(c);
        }
        
        Stack<Character> stack = new Stack<>();
        int inputIdx = 0;
        
        System.out.println("\nSimulation:");
        for (char op : ops.toCharArray()) {
            if (op == 'S') {
                if (inputIdx < inputs.size()) {
                    char val = inputs.get(inputIdx++);
                    stack.push(val);
                    System.out.println("Push " + val);
                } else {
                    System.out.println("No more inputs for push");
                }
            } else if (op == 'O') {
                if (!stack.isEmpty()) {
                    char popped = stack.pop();
                    System.out.println("Pop " + popped);
                } else {
                    System.out.println("Stack empty, cannot pop");
                }
            }
        }
        
        System.out.print("Final stack (bottom to top): ");
        if (stack.isEmpty()) {
            System.out.println("empty");
        } else {
            // Print bottom to top
            ArrayList<Character> remaining = new ArrayList<>();
            while (!stack.isEmpty()) {
                remaining.add(stack.pop());
            }
            for (int i = remaining.size() - 1; i >= 0; i--) {
                System.out.print(remaining.get(i));
            }
            System.out.println();
        }
        
        sc.close();
    }
}
