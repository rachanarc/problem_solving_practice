import java.util.Arrays;

public class MoveZerosToEnd {
    //Two pointer technique
    public static void main(String[] args) {

        int a[]={0,1,0,0,2,0,0,3,0};
        //expected : {1,2,3,0,0,0,0,0}

        int pointer = 0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==0 && pointer < a.length-1){
                pointer = pointer+1;
                while(a[pointer]==0 && pointer < a.length-1){
                    pointer = pointer+1;
                }
                a[i]=a[pointer];
                a[pointer]=0;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
