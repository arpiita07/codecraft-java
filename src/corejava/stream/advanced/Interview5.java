package corejava.stream.advanced;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Interview5 {
    //wap which will give words , which don't contains vowels in a list
    static void main() {
        List<String> list = List.of("sdfh","aecfg","abc");
        List<String> outputList = list.stream().filter( str -> str.matches(".*[aeiou].*")).
                collect(Collectors.toList());
        System.out.println(outputList);

        int i =1234; // op should be maximum number of combination no repetation, no zero . 4321
        String s = String.valueOf(i);
        System.out.println("s is "+s);
        String output = Arrays.stream(s.split(""))
                .filter(str -> !str.equals("0"))
                .distinct()
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("output is "+output);
    }
}
