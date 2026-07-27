package corejava.stream.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Mathsrelated {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,4,3,5,7,43,65,9,78);
        //separate odd and even numbers
        Map<String, List<Integer>> map = intList.stream().collect(Collectors.groupingBy(num -> num % 2 == 0 ? "EVEN" : "ODD"));
        System.out.println(map);

        //multiply 5 in each number
        List<Integer> list =  intList.stream().map(i -> i*5).collect(Collectors.toList());
        System.out.println(list);

        //print multiple of 5 from the list
    }
}
