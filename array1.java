import java.util.*;
public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] intary = new int[5];
        Arrays.fill(intary, 0); // fill method in arrays...

        double[] array1 = new double[size];
        double[] array2 = new double[size];

        int len = array1.length; // length property of array...

        for (int i = 0; i < len; i++) {
            array1[i] = Math.random(); // random number generator...
        }
        for (int i = 0; i < size; i++) {
            array2[i] = Math.random();
        }

        Arrays.sort(intary); // sort method in arrays...

        System.out.println(Arrays.compare(array1,array2)); // compare method in arrays...
        System.out.println(Arrays.equals(array1,array2)); // is equals method in arrays...

        // for each loop...
        for (double num : array1) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
