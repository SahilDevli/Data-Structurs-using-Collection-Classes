import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        // constructor For Stack...
        Stack<Integer> stack = new Stack<>();

        // stack.add(2);
        // Methods for Stack....(all functions of ArrayList + following...)

        stack.push(5);                          // push()...
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        
        System.out.println("Peek : "+stack.peek());        // peek()...
        System.out.println("POP : "+stack.pop());           // pop()...
        System.out.println("Stack Size : " + stack.size()); // size()...
        
        
        int size = stack.size();
        System.out.println("Whole Stack : " + stack);
        for(int i = 0; i < size; i++){
            System.out.println("Top element : " + stack.peek());
            stack.pop();
        }
        

        // re-filing stack...
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        // more ...
        System.out.println(stack.isEmpty()); // isEmpty()...
        System.out.println(stack.search(4)); // search(value)...
        stack.clear();                          // clear()...
        System.out.println("After clear() : "+stack);
    }
}
