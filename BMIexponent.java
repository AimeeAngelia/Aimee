package number;

public class BMIexponent {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		double height = 1.72;//��� m
		int weight = 70;//����kg
		double exponent = weight / (height*height);
		System.out.println("your height is "+height+"m");
		System.out.println("your weight is "+weight+"kg");
		System.out.println("your BMI is "+exponent);
		System.out.println("���BMIָ����");
		if (exponent<18.5) {
			System.out.println("���ع���");
		}
		if (exponent>=18.5&&exponent<24.9) {
			System.out.println("������Χ");
		}
		if (exponent>=24.9&&exponent<29.9) {
			System.out.println("����");
		}
	}

}
