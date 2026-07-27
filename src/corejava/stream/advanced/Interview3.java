package corejava.stream.advanced;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interview3 {
    //"abbccdde , find duplicate character in this string {b=2,c=2,d=2}
    static void main() {
        String s ="abbbccdde";
        Map<String, Long> count = Arrays.stream(s.split("")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> duplicate = count.entrySet().stream()
                        .filter(map -> map.getValue() >1)
                                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        System.out.println(duplicate);
    }
}
