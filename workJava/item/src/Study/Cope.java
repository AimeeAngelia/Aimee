package Study;

import java.util.Arrays;

public class Cope {
    public static void main(String[] args) {
        int arr[]= {23,42,12};
        int newArr[] = Arrays.copyOf(arr, 5);
        for(int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }
}
