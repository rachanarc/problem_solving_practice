package DSA.Array;

public class MaxConsecutiveOnes {
    //static int[] nums1 = {1,1,0,1,1,1};
    static int[] nums1 = {1,0,1,1,0,1};
    //static int[] nums1 = {0,0,0,0,0,0};

    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxCounter = 0;
        int currentCounter = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCounter++;
                maxCounter = Math.max(maxCounter, currentCounter);
            } else {
                currentCounter = 0;
                maxCounter = Math.max(maxCounter, currentCounter);
            }
        }
        return maxCounter;
    }

    public static void main(String[] args) {
        int x = findMaxConsecutiveOnes(nums1);
        System.out.println("max consecutive ones : "+x);
    }


//    int new_counter=0;
//    int old_counter=0;
//    int index = 0;
//
//    for(int num: nums){
//            if(num==1){
//                new_counter++;
//                System.out.println("new counter :"+new_counter);
//            }
//            if(index+1 < nums.length) {
//                if (nums[index + 1] == 0) {
//                    if (old_counter < new_counter) {
//                        old_counter = new_counter;
//                        new_counter = 0;
//                        System.out.println("new counter :" + new_counter);
//                        System.out.println("old counter :" + old_counter);
//                    } else if (old_counter > new_counter) {
//                        new_counter = 0;
//                        System.out.println("new counter :" + new_counter);
//                        System.out.println("old counter :" + old_counter);
//                    }
//                }
//            }
//            index++;
//        }
//    return old_counter;
//    }
//
//    public static void main(String[] args) {
//        int x = findMaxConsecutiveOnes(nums1);
//        System.out.println("final : "+x);
}
