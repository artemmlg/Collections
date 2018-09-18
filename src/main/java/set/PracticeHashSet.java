package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class PracticeHashSet extends set.DataForCollections {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(collectionValues));

        System.out.println("Collection size: " + hashSet.size());
        System.out.println("///");
        System.out.println("List of each element from collection: ");
        for (String elem : hashSet) {
            System.out.println(elem);
        }
        System.out.println("///");
        hashSet.remove(collectionValues[1]);
        System.out.println(hashSet.size());
        Iterator<String> iterator = hashSet.iterator();
        for (int i = 0; i < hashSet.size(); i++) {
            System.out.println(iterator.next());
        }

    }
}
