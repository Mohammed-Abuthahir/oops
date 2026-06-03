package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {

    public static void main(String[] args) {

//        A Lambda Expression is literally just an anonymous function—a function that has no name, no explicit return type, and no access modifiers (like public or private). And yes,
//        its primary purpose in Java is to provide the implementation for a Functional Interface.

        List<String> names = new ArrayList<>();
        names.add("Abuthahir");
        names.add("Sharmila");
        names.add("Amirnisha");

        names.forEach(name -> System.out.println("Hello ," + name));
    }
}
