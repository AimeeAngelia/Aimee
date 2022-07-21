package Study;
import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入两个数字,用空格分开：");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("num1+num2=" + (num1+num2));
        System.out.println("num1-num2=" + (num1-num2));
        System.out.println("num1*num2=" + (num1*num2));
        System.out.println("num1/num2=" + (num1/num2));
        System.out.println("num1%num2=" + (num1%num2));
        sc.close();
}
    
}
