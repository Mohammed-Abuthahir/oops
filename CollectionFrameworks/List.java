package CollectionFrameworks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class List {
    public static void demonstrateArrayList(){

        //-- ArrayList----- Dynamic Arrays , Not Thread Safe

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("C++");
        list.add("Python");
        System.out.println("Full ArrayList :" + list);
    }
    public static void demonstrateLinkedList(){

        // -- LinkedList -- Doubly Linked List, Fast for Insertion and Deletions

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Node A");
        linkedList.add("Node B");

        linkedList.add(1, "Node B");
        System.out.println("Full LinkedList :" + linkedList);
    }
    public static void demonstrateVector(){

        //-- vector -- thread Safe and Synchronized

        Vector<String> safeList = new Vector<>();

        safeList.add("Thread 1");
        safeList.add("Thread 2");

        System.out.println("Full Vector :"+safeList);

    }
    public static void demonstrateStack(){

        // -- stack -- LIFO = last in first out

        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.pop();
        System.out.println(stack);
    }
    public static void main(String[] args) {
        System.out.println("This is the ArrayList :");
        demonstrateArrayList();
        System.out.println("This is the LinkedList :");
        demonstrateLinkedList();
        System.out.println("This is the Vector :");
        demonstrateVector();
        System.out.println("This is the Stack :");
        demonstrateStack();
    }
}
