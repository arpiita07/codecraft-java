package corejava.stream.advanced;

import java.util.HashMap;
import java.util.List;

public class Interview6 {
    static void main() {
        HashMap mymap = new HashMap<>();
        mymap.put("abc","123");
        mymap.put("abc","123");
        mymap.put("cde","345");
        mymap.put("test","hello");

        List<String> keyList = mymap.keySet().stream().toList();
        List<String> valueList = mymap.values().stream().toList();
        System.out.println(keyList);
        System.out.println(valueList);


    }
}
