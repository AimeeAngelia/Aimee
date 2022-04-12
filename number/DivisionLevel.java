package number;
import java.util.Scanner;
public class DivisionLevel {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your grade:");
		int grade = s.nextInt();
		if (grade>=90&&grade<=100) {
			System.out.println("A");
		}else if(grade>=80&&grade<=90) {
			System.out.println("B");
		}else if(grade>=60&&grade<=80) {
			System.out.println("C");
		}else if(grade>=0&&grade<=60) {
			System.out.println("D");
		}else {
			System.out.println("Invalid grade");
		}
		s.close();
	}

}
