package number;

public class Restaurant {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("welcome!");
		int count = 9;
		System.out.println(count+"人");
		if (count<=4) {
			System.out.println("4人桌");
		}else if(count>4&&count<=8){
			System.out.println("8人桌");
		}else if(count>8&&count<=16) {
			System.out.println("包厢");
		}else {
			System.out.println("Sorry");
		}
	}

}
