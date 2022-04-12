package number;

public class NumberConvert {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int number = 123;
		int three = number%10;
		int number0 = (number-three)/10;
		int two = number0%10;
		int one = (number0-two)/10;	
		System.out.println(number + "转换后的结果为" + three+two+one);
		/*int number = 123; // 定义所需要的转换的数字
		// 定义三个数字接收number转换后的结果
		int number1;
		int number2;
		int number3;
		number1 = number % 10; // 计算个位数上的余数
		number2 = number / 10 % 10; // 计算十位数上的余数
		number3 = number / 100; // 计算百位数上的余数
		System.out.println(number + "转换后的结果为" + number1 + number2 + number3);*/
	}

}
