package Study;

public class Tautog {
    public static void main(String[] args) {
        int arr[][] = {{4,3},{1,2}};
        System.out.println("数组中的元素是:");
        for(int x[]:arr){
            for(int y:x){
                System.out.print(y+" ");
            }System.out.println();
        }
    }
}
