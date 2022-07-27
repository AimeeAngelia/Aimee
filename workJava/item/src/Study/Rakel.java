package Study;

import java.util.Arrays;

public class Rakel {
    public static void main(String[] args) {
        String string[] = new String[]{"ab","cd","ef","yz"};
        Arrays.sort(string);
        int index = Arrays.binarySearch(string, 0, 2, "cd");
        System.out.println(index);
    }
}
