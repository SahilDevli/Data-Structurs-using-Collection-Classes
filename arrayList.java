import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        // constructor For ArrayList...

        ArrayList<String> list = new ArrayList<>();
        //ArrayList<Integer> list = new ArrayList<>(size);

        // .............    Methods in ArrayList       .............

        list.add("alpha"); // .add() method to add element to list...
        list.add("beta");
        list.add(1,"gama");

        for(int i = 0; i < list.size(); i++) {
            System.out.print(" "+list.get(i).toString());
            // System.out.println(list.get(i));  // can also be like this.
        }

        System.out.println("\nlist.get(0) : "+ list.get(0));

        System.out.println("list.size() : "+ list.size());
        
        list.remove(2); // remove the element at perticual index...
        
        list.set(1,"beta"); // replace the element at perticular index...
        
        
        if(list.contains("alpha"))
        System.out.println("alpha present\n(list.contain return true '1')");
        else
        System.out.println("alpha not present\n(list.contain return false '0')");
        
        list.clear();
        System.out.println("list.size() after clear : "+ list.size());

    }
}
