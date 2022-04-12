package number;
import java.util.Scanner;
public class ArithmeticException {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers,用空格隔开：");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		System.out.println("num1+num2:"+(num1+num2));
		System.out.println("num1-num2:"+(num1-num2));
		System.out.println("num1*num2:"+(num1*num2));
		System.out.println("num1/num2:"+(num1/num2));
		System.out.println("num1%num2:"+(num1%num2));
		sc.close();
	}

}
