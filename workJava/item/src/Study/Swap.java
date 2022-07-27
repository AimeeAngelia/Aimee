package Study;

import java.util.Arrays;

public class Swap{
    public static void main(String[] args) {
        int arr[] = new int[5];
        Arrays.fill(arr, 8);
        for(int i=0;i<5;i++){
            System.out.println("第"+(i+1)+"个元素是:"+arr[i]);
        }
    }
}