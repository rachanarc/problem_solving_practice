package DSA.Array;

import java.util.Arrays;

public class SortedSquares {
    static int[] nums1 = {-4,-1,0,3,10};

    public static int[] sortedSquaresArray(int[] nums){
        int[] squaredSet = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            squaredSet[i] = nums[i]*nums[i];

        }
        //util to sort an int array
        Arrays.sort(squaredSet);
        return squaredSet;
    }

    public static void main(String[] args) {
        //util to print the integers of array
        System.out.println("Sorted Squares : "+ Arrays.toString(sortedSquaresArray(nums1)));
    }
}
