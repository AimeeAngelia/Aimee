package Study;

public class Eval {
    public static void main(String[] args) {
        int a, b, c;
        a = 15;
        c = b = a+4;
        System.out.println("c的值为:" + c);
        System.out.println("b的值为:" + b);
        int zero = 0;
        System.out.println(1/zero);//ArithmeticException
    }
}
