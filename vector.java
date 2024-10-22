import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        // constructor For Vector...
        Vector<Integer> vector = new Vector<>();


        // Methods for Vector....(all functions of ArrayList + following...)
        for(int i = 0 ; i<5 ; i++){
            vector.add(i);
        }

        // firstElement() && lastElement()....
        System.out.println("First element : "+vector.firstElement()); // get element from start of vector...
        System.out.println("Last element : "+vector.lastElement()); // get element from end of vector...
        

        // isEmpty()....
        if(vector.isEmpty())
        System.out.println("isEmpty returns 'True'");
        else
            System.out.println("isEmpty returns 'False'");

        
        // capasity() && trimToSize() ...
        System.out.println("Capasity of Vector : "+vector.capacity()); // initial 5 + alocated 5 = 10..
        vector.trimToSize();  // delete extra slots in vector...
        System.out.println("Capasity of Vector after trimToSize(): "+vector.capacity()); // after trim to size method..


        //System.out.println(vector.get(0));
        // vector.removeLast();
        // System.out.println(vector.getLast());
        // remove() , clear() , getfirst() , removelast()...
        
    }
}
