package corejava.stream.advanced;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class Interview4 {
    //hello world , output must be : world hello
    static void main() {
        String str = "hello world";
        String output = Arrays.stream(str.split(" "))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),list ->{
                            Collections.reverse(list);
                            return list.stream();
                        }
                )).collect(Collectors.joining(" "));
        System.out.println(output);
    }
}
