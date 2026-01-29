import java.util.Stack;

public class StackSimulation1 {
    public static void main(String[] args) {
        // Input elements to be pushed
        char[] inputs = {'M', 'B', 'Y', 'N', 'R'};
        // Operation sequence: S = Push, U = Pop
        char[] operations = {'S', 'S', 'U', 'S', 'U', 'S', 'U', 'S', 'U'};

        Stack<Character> stack = new Stack<>();
        int index = 0; // To track which input to push next

        System.out.print("Output: ");

        for (char op : operations) {
            if (op == 'S') {
                // Push operation
                stack.push(inputs[index]);
                index++;
            } else if (op == 'U') {
                // Pop operation (if stack not empty)
                if (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                    if (index < operations.length) System.out.print(", ");
                }
            }
        }

        System.out.println(); // newline at end

        // Show remaining stack
        System.out.println("Remaining stack: " + stack);
    }
}
