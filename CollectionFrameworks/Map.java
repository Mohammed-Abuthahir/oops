package CollectionFrameworks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {
    public static void HashMap(){

        //HashMap -- Using Hasing , Stores key -value Pairs , no order gurantee

        HashMap<Integer , Character> map = new HashMap<>();
        int idx = 0;
        for(int i = 97; i <= 122 ; i++){
            map.put(idx++, (char) i);
        }
        System.out.println(map);
    }
    public static void LinkedHashMap(){

        //LinkedHashMap -- Similar to HashMap but maintains a doubly-linked list running through all its entries to preserve insertion order.

        LinkedHashMap<Integer, Character> map = new LinkedHashMap<>();
        int idx = 0;
        for(int i = 97; i <= 122 ; i++){
            map.put(idx++, (char) i);
        }
        System.out.println(map);

    }
    public static void TreeMap(){

        //TreeMap -- Keeps keys sorted in their natural sorted order or via a custom comparator.

        TreeMap<Integer, Character> map = new TreeMap<>();
        int idx = 26;
        for(int i = 122; i >= 97 ; i--){
            map.put(idx--, (char) i);
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        System.out.println("---- HashMap ---- ");
        HashMap();
        System.out.println("---- LinkedHashMap ----");
        LinkedHashMap();
        System.out.println("---- TreeMap -----");
        TreeMap();
    }
}
