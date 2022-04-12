package number;

public class SellSeats {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=10;j++) {
				if (i==1||i==4) {
					continue;
				}System.out.println("第"+i+"行,第"+j+"个座位可坐。");
			}
		}
	}

}
