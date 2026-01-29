import java.util.*;

// Class representing the Stack Simulator
class StackSimulator {
    private Stack<Character> stack;  // actual stack
    private int maxSize;             // stack capacity
    private char[] inputs;           // input elements
    private List<Character> output;  // list to store popped elements

    // Constructor
    public StackSimulator(int maxSize, char[] inputs) {
        this.stack = new Stack<>();
        this.maxSize = maxSize;
        this.inputs = inputs;
        this.output = new ArrayList<>();
    }

    // Push next element if stack is not full
    public void push(char element) {
        if (stack.size() < maxSize) {
            stack.push(element);
        } else {
            System.out.println("Stack full! Cannot push " + element);
        }
    }

    // Pop element from stack and store in output
    public void pop() {
        if (!stack.isEmpty()) {
            char popped = stack.pop();
            output.add(popped);
        } // else ignore if stack empty
    }

    // Execute a sequence of operations (S = push, U = pop)
    public void runOperations(char[] operations) {
        int inputIndex = 0;

        for (char op : operations) {
            if (op == 'S') {
                if (inputIndex < inputs.length) {
                    push(inputs[inputIndex++]);
                }
            } else if (op == 'U') {
                pop();
            } else {
                System.out.println("Invalid operation: " + op);
            }
        }
    }

    // Display final output and remaining stack
    public void displayResult() {
        System.out.println("Output: " + output);
        System.out.println("Remaining Stack: " + stack);
    }
}

// Main class to run the simulation
public class t1 {
    public static void main(String[] args) {
        // Stack size 5, 6 input elements
        char[] inputs = {'A', 'B', 'C', 'D', 'E', 'F'};
        char[] operations = {'S','S','U','U','S','U','U','S','S'}; // operation sequence

        StackSimulator simulator = new StackSimulator(5, inputs);
        simulator.runOperations(operations);
        simulator.displayResult();
    }
}
