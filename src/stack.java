import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        // Create a Stack
        Stack<Integer> stack = new Stack<>();

        // Push items onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the stack
        System.out.println("Stack: " + stack);

        // Pop an item from the stack
        int poppedItem = stack.pop();
        System.out.println("Popped item: " + poppedItem);

        // Display the stack after pop
        System.out.println("Stack after pop: " + stack);
    }
}
