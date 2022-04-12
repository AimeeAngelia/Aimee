package number;

public class First {
	static String s1 = "你好";
	static int a = 15;
	static int b = 20;
	//int
	static byte a_byte = 19;
	static byte b_byte = -45;
	//byte
	static short a_short = 1000;
	static short t = -19;
	static int r = a_short / t;
	//short
	static long number = 12345678L;
	static long rum = -987654321L;
	//long
	//加L
	static float f1 = 13.23f;
	static double d1 = 4562.12d;
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s2 = "Java";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(15 + 20); //输出35
		System.out.println(a+b);//等于15 + 20
		System.out.println(a_byte+b_byte);
		System.out.println(r);
		System.out.println(number*rum);
		System.out.println(f1 + d1);
	}

}
