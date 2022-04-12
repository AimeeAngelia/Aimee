package number;
import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("输入一个数字,判断奇偶:");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		if (number%2==0) {
			System.out.println(number+"是偶数。");
		}else {
			System.out.println(number+"是奇数。");
		}
		s.close();
	}

}
