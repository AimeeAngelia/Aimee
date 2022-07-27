package Study;

import java.util.Arrays;

public class Repeat {
    public static void main(String[] args) {
        int arr[] = {23,42,12,84,10};
        int newArr[] = Arrays.copyOfRange(arr, 0, 3);
        for(int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }
}
