package corejava.stream.advanced;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interview7 {
    // swiss : find out the first non repeting character in the list
    public static void main(String args[]){
        String s ="swiss";
        String output = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(map -> map.getValue() == 1)
                .map(m -> m.getKey()).findFirst().get();
        System.out.println(output);
    }
}
