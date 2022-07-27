package Study;

import java.util.Arrays;

public class Reference {
    public static void main(String[] args) {
        int arr[] = new int []{1,8,9,4,5};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, 4);
        System.out.println("4的index位置是"+index);
    }
}
