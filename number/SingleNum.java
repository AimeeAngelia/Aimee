package number;

public class SingleNum {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int dividend=1;
		int times=0;
		int end=0;
		for (int i=1;i<=100;i++) {
			while(dividend<=i) {
				if(i%dividend==0) {
					times++;
				}
				dividend++;
			}dividend=1;
			if(times==2) {
				System.out.println(i);
				end++;
			}times=0;
		} System.out.println("总共"+end+"个素数。");
	}

}
