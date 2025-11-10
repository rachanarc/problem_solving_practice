package DSA.Array;

import java.util.Arrays;

public class DuplicateZeros {
    //static int[] arr = {1,0,2,3,0,4,5,0};
    //static int[] arr = {1,2,3};
    static int[] arr = {8,4,5,0,0,0,0,7};

    public static void addDuplicateZeros(){
        int length = arr.length;

        for(int i=0; i< length-1; i++){
            if(arr[i]==0){
                for(int x=length;x>i+1;x--){
                    arr[x-1] = arr[x-2];
                }
                i++;
            }
        }
        System.out.println("final : " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        addDuplicateZeros();
    }
}
