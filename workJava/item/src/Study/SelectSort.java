package Study;


public class SelectSort {
    public static void main(String[] args) {
        int arrays[] = new int[]{63,4,24,1,3,15};
        SelectSort sorter = new SelectSort();
        sorter.sort(arrays);
    }
    public void sort(int[] arrays){
        int index;
        for(int i=1;i<arrays.length;i++){
            index=0;
            for(int j=1;j<=arrays.length-i;j++){
                if(arrays[j]>arrays[index]){
                    index=j;
                }
            }
            int tmp = arrays[arrays.length-i];
            arrays[arrays.length-i] = arrays[index];
            arrays[index] = tmp;
        }
        
        showArrays(arrays);
    }
    public void showArrays(int[] arrays){
        for(int x: arrays){
            System.out.print("<"+x);
        }
    }
}
