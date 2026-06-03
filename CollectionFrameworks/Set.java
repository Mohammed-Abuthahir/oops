package CollectionFrameworks;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void HashSet(){

        //-- HashSet = Unique Value only , Does Not Follow the Order

        HashSet<Integer> set = new HashSet<>();

        set.add(4); set.add(1); set.add(5);
        set.add(2); set.add(3); set.add(6);

        System.out.println(set);
    }

    public static void LinkedHashSet(){

        // LinkedHashSet = Unique value only , Order is Remaining Same

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(22); set.add(11); set.add(99); set.add(8);

        System.out.println(set);
    }

    public static void TreeSet(){

        // TreeSet = Unique value Only , Its Follow the Order because it uses the AVL tree

        TreeSet<Integer> set = new TreeSet<>();

        set.add(3); set.add(1);
        set.add(2); set.add(10);

        System.out.println(set);
    }
    public static void main(String[] args) {
        HashSet();
        LinkedHashSet();
        TreeSet();
    }
}
