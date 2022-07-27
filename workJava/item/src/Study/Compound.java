package Study;

public class Compound {
    public static void main(String[] args) {
        int x = 20;
        System.out.println("x="+x);
        {
            int y = 40;
            System.out.println(y);
            int z = 245;
            boolean b;
            {
                b = y > z;
                System.out.println(b);
            }
        }
        String word = "hello Java";
        System.out.println(word);
    }
}
