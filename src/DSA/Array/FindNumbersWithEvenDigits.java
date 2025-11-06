package DSA.Array;

public class FindNumbersWithEvenDigits {
    //static int[] nums1 = {12,345,2,6,7896};
    static int[] nums1 = {555,901,482,1771};

    public static int findNumbers(int[] nums){
        int counter = 0;
        for(int num : nums){
            int length = (String.valueOf(num)).length();
            if(length%2 == 0){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println("Numbers with even digits : " +findNumbers(nums1));
    }
}
