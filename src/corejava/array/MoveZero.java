package corejava.array;

import java.util.Arrays;

public class MoveZero {
    public static void main(String args[]) {
        int[] arr = {1, 0, 2, 0, 4, 0, 5};
        moveZero(arr);
        reverse(arr);

    }

    private static void moveZero(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.println(STR."reverse array is\{Arrays.toString(arr)}");
    }
}

