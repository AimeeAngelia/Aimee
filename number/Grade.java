package number;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your grade:");
		int grade = s.nextInt();
		switch(grade) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
		case 6:
			System.out.println("C");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("D");
			break;
		default:
			System.out.println("Invalid grade");
		}
		s.close();
	}

}
