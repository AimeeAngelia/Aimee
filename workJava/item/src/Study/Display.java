package Study;

import java.util.Arrays;

public class Display {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Arrays.fill(arr, 1, 3, 10);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
