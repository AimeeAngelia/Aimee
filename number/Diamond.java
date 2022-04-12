package number;

public class Diamond {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int times=1;
		int j=8;
		int time=1;
		for(int i=1;i<=17;i+=2,j--) {
			while(time<=j) {
				System.out.print("  ");
				time++;
			}time=1;
			while(times<=i) {
				System.out.print("* ");
				times++;
			 }
				times=1;
				System.out.println();
			}
		int jj=1;
		int timetime=1;
		int timestimes=1;
		for(int ii=15;ii>=1;ii-=2,jj++) {
			while(timetime<=jj) {
				System.out.print("  ");
				timetime++;
			}timetime=1;
			while(timestimes<=ii) {
				System.out.print("* ");
				timestimes++;
			}timestimes=1;
			System.out.println();
		}
		
		
				int lineCount = 17;// 输出的菱形有多少行，请赋值成奇数

				int maxLineNum = (lineCount + 1) / 2;// 菱形最多一行
				for (int i = 1; i <= maxLineNum; i++) {// 循环菱形数量越来越多的几行
					for (int space = 1; space <= maxLineNum - i; space++) {// 输出空格，数量=最后一行-当前行数
						System.out.print("  ");
					}
					for (int star = 1; star <= (i * 2) - 1; star++) {// 输出星号，数量=行数*2-1
						System.out.print("* ");
					}
					System.out.println();// 换行
				}

				int declineCount = lineCount - maxLineNum;// 计算剩下的几行，这几行星号的数量是递减的
				for (int i = 1; i <= declineCount; i++) {// 循环菱形数量越来越少的行数
					for (int space = 1; space <= i; space++) {// 输出空格，数量等于当前的行数
						System.out.print("  ");
					}
					for (int star = 1; star <= (declineCount - i + 1) * 2 - 1; star++) {// 输出星号，数量等于（总数-当前行数）*2-1
						System.out.print("* ");
					}
					System.out.println();
				}

			
		
	}

}
