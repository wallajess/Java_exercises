package EA2_2;

public class StackTest {
        public static void main(String[] args) {
            Stack stack = new Stack();
            
            System.out.println(stack.isEmpty()); // true
            stack.push("a");
            System.out.println(stack.peek()); // a
            stack.push("b");
            System.out.println(stack.peek()); // b
            stack.push("c");
            System.out.println(stack.peek()); // c
            System.out.println(stack);
            System.out.println(stack.pop()); // c
            System.out.println(stack.peek()); // b
            System.out.println(stack.isEmpty()); //false
        }
    }