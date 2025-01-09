import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class hashSet{
    public static void main(String[] args) {
        // contructor to create Hash Set ...
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
        
        // methods use in Hash Set...
        set1.add(7);  // add element to set if not repeting...
        set2.add(10);
        
        set1.addAll(set2); // Union of Set1 and Set2 in Set1...
        
// ------------------------------------------[ Iterator ]--------------------------------------------------

        Iterator<Integer> it = set1.iterator(); // Iterator Constructor for Set1...
        System.out.print("\nSet1 Contains : ");
        while(it.hasNext()){      // .hasNext() to check element is exsist or not... 
            System.out.print(it.next()+" ");    // .next() to print value...
        }
        
        
        HashSet<Integer> set3 = new HashSet<>(Arrays.asList(4,5,6,11,12,13));
        set3.retainAll(set1);   // Intersection of set1 and set3 into set3...
        
        Iterator<Integer> it3 = set1.iterator();
        System.out.print("\nSet3 Contains : ");
        while(it3.hasNext()){
            System.out.print(it3.next()+" ");
        }

        set3.clear(); // remove all element from set3...
        System.out.println("\n"+set1.contains(10)); // true/fasle...
        System.out.println(set1.size());        // size of set1...
        set2.toArray();         // covert to array...
    }
}
    