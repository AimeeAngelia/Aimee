package Study;

public class BreakInsideNested {
    public static void main(String[] args) {
        // for(int i=1;i<=3;i++){
            loop:for(int i=1;i<=3;i++){
            for(int j=1;j<=5;j++){
                if(j==4){
                    // break;
                    break loop;
                }
                System.out.println("i="+i+",j="+j);
            }
        }
    }
}
