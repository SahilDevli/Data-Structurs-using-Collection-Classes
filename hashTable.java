// -> HashTable(& it's mehtods) is Syncronized and thread safe. this is only diff. from HashMap

// both came under Map class...

import java.util.Hashtable;
public class hashTable {
    public static void main(String[] args) {
        // cunstructor for HashTable
        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();

        // methods for HashTable
        ht.put(1, "one"); // put() method to add element to HashTable...
        ht.put(2, "two");
        ht.put(3, "three");
        ht.put(4, "three"); // auto remove this cuz new value to key '4' is assigned below not gonna make new key-value pair...
        ht.put(4, "four"); // will update above key-value pair( • key should be unique )

        System.out.println("ht.get(key:2) : "+ht.get(2)); // .get(key)..
        
        System.out.println("ht.keySet() : "+ht.keySet()); // view of all keys..
        System.out.println("ht.values() : "+ht.values()); // view of all values..

        System.out.println("ht.containsKey(key:4) : "+ht.containsKey(4)); // check for key:4..          
        System.out.println("ht.remove(key:4) : "+ht.remove(4)); // delete kay-value of key '4'..

        System.out.println("ht.size() : "+ht.size()); //size(no. of tuples) of HashTable..

        System.out.println("ht.entrySet() : "+ht.entrySet()); // the HashTable..
        // System.out.println("HashSet is : "+ht); ---> similar to entrySet()..

        for (String value : ht.values()) {
            System.out.println("Value: " + value);
        }
        
        System.out.println("ht.isEmpty() : "+ht.isEmpty()); // check HashTable is empty or not..
        
        ht.clear(); // delete all elements from HashTable..
        
        System.out.println("After clear() : "+ht); // check HashTable after clear()..
    }
}
