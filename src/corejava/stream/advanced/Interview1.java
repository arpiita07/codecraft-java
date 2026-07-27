package corejava.stream.advanced;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interview1 {
    static void main() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("Animal", Arrays.asList("Lion","Tiger","Elephant","Giraffe","Tiger"));
        map.put("Fruits",Arrays.asList("Apple","Banana","Cherry","Date","Elderberry","Fig"));
        map.put("Cities",Arrays.asList("Mumbai","Delhi","Bengaluru","Kolkata","chennai","Hydrabad","Pune","Jaipur"));
        //give a list of combination of Animal and cities where animal !=giraffe, city != jaipur
        //City should not be more than 5 char
        //Animal should be distinct, city may or may not be
        List<String> animalList = map.get("Animal");
        List<String> fruitsList = map.get("Fruits");
        List<String> citiesList = map.get("Cities");

        List<String> list1 = animalList.stream().filter(a -> !a.equalsIgnoreCase("giraffe")).toList();
        List<String> list2 = citiesList.stream().filter(a -> !a.equalsIgnoreCase("jaipur")).toList();
        List<String> finalList = Stream.concat(list1.stream(),list2.stream()).toList();
        System.out.println(finalList);

        citiesList.stream().filter( c-> c.length() <5).forEach(System.out::println);

       System.out.println(Stream.concat(animalList.stream().distinct().toList().stream(),citiesList.stream()).toList());

    }
}
