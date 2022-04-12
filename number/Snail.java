package number;

public class Snail {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int distant = 10;
		int snailwalk = 0;
		int days=0;
		while (snailwalk<distant) {
			days++;
			snailwalk+=2;
			if (snailwalk>=distant) {
				break;
			}
			else {
				snailwalk-=1;
			}
		}System.out.println("需要"+days+"天");
		
		int distance = 0;
		int day = 1;
		while (true) {
			distance += 2;
			if (distance >= 10) {
				break;
			}
			distance -= 1;
			day++;
		}
		System.out.println("蜗牛第" + day + "天爬到了井口。");
	}

}
