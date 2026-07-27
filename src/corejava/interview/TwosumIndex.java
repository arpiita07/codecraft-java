package corejava.interview;

import java.util.HashMap;
import java.util.Map;

public class TwosumIndex {
    static void main(String[] args) {
        int[] arr={2,6,7,11,15};
        int target=9; // output should be 0,1 .
       //as we need 2 output we can take map
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){

            int diff=target-arr[i];

            if(map.containsKey(diff)){
                System.out.println(map.get(diff)+" "+i);
                break;
            }

            map.put(arr[i],i);
        }
    }
}
