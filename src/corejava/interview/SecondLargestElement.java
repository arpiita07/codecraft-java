package corejava.interview;

import java.util.Arrays;

public class SecondLargestElement {
    static void main(String[] args) {
        int[] arr = {10, 5, 40, 30, 20};
        Integer op = Arrays.stream(arr)
                .boxed().distinct().sorted((a, b) -> b - a)   // Descending order
                .skip(1)
                .findFirst()
                .get();
        System.out.println(op);

    }
}
