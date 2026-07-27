package corejava.interview;

import java.util.Arrays;

public class ShiftAllOneToLeft {
    static void main() {
        int[] a = {2,3,4,3,1,3,1,5,1,7,1,9,1,5};
        int[] result = shiftFunction(a);
        System.out.println(Arrays.toString(result));
    }

    private static int[] shiftFunction(int[] arr) {
        int counter =0;
        int[] res = new int[arr.length];
        for(int i: arr){
            if(i ==1){
                counter++;
            }
        }
        Arrays.fill(res,0,counter,1); // it will add all 1 initially
        int index= counter;
        for(int i : arr){
            if(i != 1){
                res[index] = i;
                index++;
            }

        }
        return res;
    }

}
