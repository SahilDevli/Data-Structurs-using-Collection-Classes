//import java.util.Deque; ...---> Deque means double ended queue.
import java.util.ArrayDeque;

public class dequeue {
    public static void main(String[] args) {
        // constructor of Arraydeque
        ArrayDeque<Integer> Dq = new ArrayDeque<>();

        // method in Arraydequeue ...

        Dq.offerFirst(1);       // insert from start..
        Dq.offerLast(2);        // insert from end...
        Dq.offerFirst(3);
        Dq.offer(4);            // insert auto -> (at the end) ...

        System.out.println("First element : " + Dq.peekFirst());
        System.out.println("Last element : "+ Dq.peekLast());

        Dq.pollFirst(); // delete from first...
        Dq.pollLast();  // delete from last...

        Dq.contains(5); //return true or false...
        // int size = Dq.size();
    }
}
