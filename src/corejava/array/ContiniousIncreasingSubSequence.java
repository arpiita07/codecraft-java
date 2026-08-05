package corejava.array;

import java.util.ArrayList;
import java.util.List;

public class ContiniousIncreasingSubSequence {
    static void main(String[] args) {
        int[] arr = {2,3,8,5,9,10,19,25,8};

        int startIndex =0;       // Current sequence starts here
        int maxStart =0;    // Longest sequence starts here
        int maxLength = 1;   // Length of longest sequence

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] <= arr[i - 1]) { //3 <=2 , 8<=3, then 5<=8 , when i =4 then 9<=5
                startIndex = i;          // start a new sequence  so start = index 3
            }

            int tempLengthnow = i - startIndex + 1; // 3-3+1 = 1 , i=4,4 - 3 + 1 = 2

            if (tempLengthnow > maxLength) { //1 > 1 .. no , 2>1
                maxLength = tempLengthnow; // maxlength =2
                maxStart = startIndex; // maxstart=3
            }

        }
        //now we have a sequence {5,9}
        for (int i = maxStart; i < maxStart + maxLength; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
