package number;
import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("����һ������,�ж���ż:");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		if (number%2==0) {
			System.out.println(number+"��ż����");
		}else {
			System.out.println(number+"��������");
		}
		s.close();
	}

}
