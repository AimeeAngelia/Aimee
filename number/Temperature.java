package number;

public class Temperature {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		double celsius=-30;
		double Fahrenheit=0;
		do {
			Fahrenheit=32+celsius*1.8;
			System.out.println("�����¶ȣ�"+celsius+"��C        "+"�����¶ȣ�"+Fahrenheit+"�H");
			celsius+=10;
		}while(celsius<=50);
	}

}
