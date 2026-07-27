package corejava.array;

import java.util.HashSet;
import java.util.Set;

public class CountConsucativeNumber {
    static void main(String[] args) {

        int[] arr = {1, 9, 4, 2, 99, 44, 3};

        int longest = 0;

        for (int i = 0; i < arr.length; i++) {

            int current = arr[i];
            int count = 1;
            boolean found = true;

            while (found) {

                found = false;

                for (int j = 0; j < arr.length; j++) {

                    if (arr[j] == current + 1) {
                        current++;
                        count++;
                        found = true;
                        break;
                    }
                }
            }

            if (count > longest) {
                longest = count;
            }
        }

        System.out.println("Longest Sequence Length = " + longest);


        usingHashset(arr);


    }

    private static void usingHashset(int[] arr) {
        Set<Integer> set = new HashSet<>();

        // Store all elements in HashSet
        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            // Check if current number is the starting point
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        System.out.println("Longest Consecutive Sequence Length = " + longest);
    }
}

