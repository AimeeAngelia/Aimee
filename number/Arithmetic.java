package number;
import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int $1=0;
		int $2=1;
		int $3=0;
		int times = 0;
		int endsnumber = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Query the nth Fibonacci number and enter -1 to exit:");
		int number = s.nextInt();
		while(number>0) {
		switch(number) {
		case 1:
			System.out.println("The 1th number of the Fibonacci sequence:1");
			break;
		default:
			while(times<(number-1)) {
				$3=$2;
				$2=$2+$1;
				$1=$3;
				times++;
				endsnumber=$2;
			}
			System.out.println("The "+number+"th number of the Fibonacci sequence:"+endsnumber);
			System.out.print("Query the nth Fibonacci number and enter -1 to exit:");
			number = s.nextInt();
			$1=0;
			$2=0;
			$3=0;
			times=0;
			endsnumber=0;
		}
		}System.out.println("Looking forward to the next meeting!");
		s.close();
	}

}
