package number;

public class Circulate {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int sum = 0;
		for (int i=2;i<=100;i+=2) {
			sum = sum + i;
		}
		System.out.println("The sum of all even numbers between 2 and 100 is:"+sum);
	}

}
