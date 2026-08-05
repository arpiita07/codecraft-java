package corejava.array;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4,9}; //{4,-1,2,1} if i added 9 after 1 o/p =6, 6-5 =1 (irs a positivve number
        //so 1+4+9 = 14
        int current = arr[0];
        int max = arr[1];
        for(int i =0; i< arr.length; i++){
            current = Math.max(arr[i],current+arr[i]);
            max = Math.max(max,current);
        }
        System.out.println(max);

    }
}
