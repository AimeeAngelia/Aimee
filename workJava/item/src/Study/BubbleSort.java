package Study;

public class BubbleSort {
    public static void main(String[] args) {
        int arrays[] = new int[]{63,4,24,1,3,15};
        BubbleSort sorter = new BubbleSort();
        sorter.sort(arrays);
    }
    public void sort(int[] arrays){
        for(int i=1;i<arrays.length;i++){
            for(int j=0;j<arrays.length-i;j++){
                if(arrays[j]>arrays[j+1]){
                    int tmp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = tmp;
                }
            }
        }showArrays(arrays);
    }
    public void showArrays(int[] arrays){
        for(int x:arrays){
            System.out.print("<"+x);
        }
    }

}

