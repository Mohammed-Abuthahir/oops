package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Imagine you have a list of numbers, and you want to filter
// out the even numbers, multiply each by 2, and collect the result into a new list.
public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,6);

        List<Integer> processingIntger = number.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());


        System.out.println(number);
        System.out.println(processingIntger);
    }
}
