package number;
import java.util.Scanner;
public class LoginService {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		int password;
		do {
			System.out.println("Please enter a six-digit password:");
			password = s.nextInt();
		}while(931567!=password);
		System.out.println("login successful!");
		s.close();
	}

}
