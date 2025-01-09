import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        // constructor For LinkedList...
        LinkedList<Integer> list = new LinkedList<>();
            // LinkedList<Integer> list = new LinkedList<>(size);
        
            
        // Methods for LinkedList....(all functions of ArrayList + following...)
        list.addFirst(1); // add element from start of list...
        list.addFirst(0);
        list.addLast(2); // add element from end of list...
        list.addLast(3);

        // current list {0,1,2,3}

        list.removeFirst(); // remove element from start of list...
        list.removeLast(); // remove element from end of list...
        
        // current list {1,2}

        System.out.println("First element : "+list.getFirst()); // get element from start of list...
        System.out.println("Last element : "+list.getLast()); // get element from end of list...
    }
}