package Study;

public class ReverseSort {
    public static void main(String[] args) {
        int arrays[] = new int[]{10,20,30,40,50,60,70};
        ReverseSort sorter = new ReverseSort();
        sorter.sort(arrays);
    }
    public void sort(int[] arrays){
        System.out.print("数据原有内容:");
        showArrays(arrays);
        int tmp;
        int length = arrays.length;
        for(int i=0;i<(length/2);i++){
            tmp=arrays[i];
            arrays[i]=arrays[length-i-1];
            arrays[length-i-1]=tmp;
        }System.out.print("数据反转后内容:");
        showArrays(arrays);
    }
    public void showArrays(int[] arrays){
        for (int i : arrays) {
            System.out.print(i+" ");
        }System.out.println();
    }
}
