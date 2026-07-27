package corejava.stream.advanced;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class stringrelated {
    public static void main(String[] args) {
        //1. Check Unique Characters Input : abcdef  Output true
        String str = "abcabcbb";
        Boolean ans = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream().allMatch(value -> value == 1);
        System.out.println(ans);

        //2. Remove Duplicate Characters
        String output = Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
        String s = "aabbccddeeghh";
        //3. First Unique Character .. g // leet code 387
         String op = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(value -> value.getValue() == 1).findFirst().get().getKey();
         System.out.println(op);
         //4. Input :swiss  Output: first nonrepeting character  w
        //But because HashMap has no guaranteed iteration order, your program might print i
        Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue()==1)
                .findFirst().get().getKey();
    }
}
