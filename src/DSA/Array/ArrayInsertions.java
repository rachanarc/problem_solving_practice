package DSA.Array;

import java.util.Arrays;

public class ArrayInsertions {

    static int[] array1 = new int[6];
    static int counter = 0;

    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            array1[i] = counter;
            counter ++;
        }
        System.out.println("filled spaces : " + Arrays.toString(array1));

        insertAtEndArray();
        insertAtStartArray();
        insertInTheMiddleArray();
    }

    public static void insertAtEndArray(){
        array1[counter] = counter++;
        System.out.println("after inserting at END : "+ Arrays.toString(array1));
    }

    public static void insertAtStartArray(){
        for(int i=counter;i>=0;i--){
            array1[i+1] = array1[i];
            if(i==0){
                array1[i]=counter;
            }
        }
        System.out.println("after inserting at START : "+ Arrays.toString(array1));
    }

    public static void insertInTheMiddleArray(){
        int middle = array1.length/2;
        for(int i=counter;i>=middle;i--){
            array1[i+1]=array1[i];
            if(i==middle){
                counter++;
                array1[middle]=counter;
            }
        }
        System.out.println("FINAL after inserting at MIDDLE : "+ Arrays.toString(array1));
    }

}
