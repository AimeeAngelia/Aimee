package number;

public class NumberConvert {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int number = 123;
		int three = number%10;
		int number0 = (number-three)/10;
		int two = number0%10;
		int one = (number0-two)/10;	
		System.out.println(number + "ת����Ľ��Ϊ" + three+two+one);
		/*int number = 123; // ��������Ҫ��ת��������
		// �����������ֽ���numberת����Ľ��
		int number1;
		int number2;
		int number3;
		number1 = number % 10; // �����λ���ϵ�����
		number2 = number / 10 % 10; // ����ʮλ���ϵ�����
		number3 = number / 100; // �����λ���ϵ�����
		System.out.println(number + "ת����Ľ��Ϊ" + number1 + number2 + number3);*/
	}

}
