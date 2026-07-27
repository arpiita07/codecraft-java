package corejava.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;


import static corejava.interview.BracesProblem.isParenthesisBalanced;

public class Practice {
        public static void main(String[] args) {
            List<String> list = Arrays.asList("abc","bbc","abc");
            List<String> output = list.stream().
                    collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet().stream().filter( value -> value.getValue() >1)
                    .map(Map.Entry::getKey).collect(Collectors.toList());
            System.out.println(output);

        }


}