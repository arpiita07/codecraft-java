package corejava.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
    static void main(String[] args) {

        String word = "Hello world";
        String s1 =  Arrays.stream(word.split(" ")).collect(Collectors.collectingAndThen(
                Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return list.stream();
                }
        )).collect(Collectors.joining());
        System.out.println(s1);

        String str ="hello";
        System.out.println(new StringBuilder(str).reverse().toString());
        //without builder
        reverseString(str);


    }

    private static void reverseString(String str) {
       String rev = "";
        for(int i = str.length();i <= 0 ; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println("palindrome");
        }
    }
}
