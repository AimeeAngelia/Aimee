package number;

public class Temperature {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double celsius=-30;
		double Fahrenheit=0;
		do {
			Fahrenheit=32+celsius*1.8;
			System.out.println("摄氏温度："+celsius+"°C        "+"华氏温度："+Fahrenheit+"℉");
			celsius+=10;
		}while(celsius<=50);
	}

}
