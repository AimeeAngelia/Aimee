package number;

public class Moneyorder {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String ICBC = "中国工商银行";
		String data = "2021-03-10";
		String name = "张三";
		String account = "1234567890987654321";
		String currency = "CNY";
		String money = "100.0";
		String serialNumber = "010";
		String counterNumber = "12345";
		System.out.println("\t"+ICBC+"\n\n");
		System.out.println("---------------------------");
		System.out.println("日期：\t"+data);
		System.out.println("户名：\t"+name);
		System.out.println("账号：\t"+account);
		System.out.println("币种：\t"+currency);
		System.out.println("存款金额："+money);
		System.out.println("存款序号："+serialNumber);
		System.out.println("柜员号；\t"+counterNumber);
		System.out.println("---------------------------");
	}

}
