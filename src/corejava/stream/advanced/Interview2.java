package corejava.stream.advanced;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interview2 {
    static void main() {
        String s = " I am a good Programmer";
        //output should be second highest length : good
        Optional<String> output = Arrays.stream(s.split(" ")).distinct()
                .sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst();
        System.out.println(output.get());

        //frequency of each word in a string
        List<String> list = Arrays.asList("pen","pencil","pen","rubber");
        Map<String,Long> mymap = list .stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mymap);

        //frequency of letter in a string
        String s1 ="arpita";
        Map<String,Long> mymap1 =Arrays.stream(s1.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mymap1);
    }
}
