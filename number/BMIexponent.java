package number;
import java.util.Scanner;
public class BMIexponent {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		double height;//身高 m
		int weight;//体重kg
		System.out.println("Enter your height:(m)");
		height = s.nextDouble();
		System.out.println("Enter your weight:(kg)");
		weight = s.nextInt();
		s.close();
		double exponent = weight / (height*height);
		System.out.println("your height is "+height+"m");
		System.out.println("your weight is "+weight+"kg");
		System.out.println("your BMI is "+exponent);
		System.out.println("你的BMI指数：");
		if (exponent<18.5) {
			System.out.println("体重过轻");
		}
		if (exponent>=18.5&&exponent<24.9) {
			System.out.println("正常范围");
		}
		if (exponent>=24.9&&exponent<29.9) {
			System.out.println("肥胖");
		}
	}

}
