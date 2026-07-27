package corejava.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ArrayRotation {
    static void main(String[] args) {
        List<Integer> list = List.of(7,8,9,3,6,5,8);
        int k =2;
        //roate by 2
        Stack<Integer> store = new Stack<>();
        List<Integer> resList = new ArrayList<>();
        for(int i= 0; i< list.size();i++ ){
            if(i >= list.size()-k){
                resList.add((list.get(i)));
            }
            else{

                store.push(list.get(i));
            }
        }
        if(store !=null){
            for(Integer num : store){
                resList.add(num);
            }
        }
        System.out.println(resList);
    }
}
