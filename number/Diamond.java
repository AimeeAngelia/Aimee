package number;

public class Diamond {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
		
		
				int lineCount = 17;// ����������ж����У��븳ֵ������

				int maxLineNum = (lineCount + 1) / 2;// �������һ��
				for (int i = 1; i <= maxLineNum; i++) {// ѭ����������Խ��Խ��ļ���
					for (int space = 1; space <= maxLineNum - i; space++) {// ����ո�����=���һ��-��ǰ����
						System.out.print("  ");
					}
					for (int star = 1; star <= (i * 2) - 1; star++) {// ����Ǻţ�����=����*2-1
						System.out.print("* ");
					}
					System.out.println();// ����
				}

				int declineCount = lineCount - maxLineNum;// ����ʣ�µļ��У��⼸���Ǻŵ������ǵݼ���
				for (int i = 1; i <= declineCount; i++) {// ѭ����������Խ��Խ�ٵ�����
					for (int space = 1; space <= i; space++) {// ����ո��������ڵ�ǰ������
						System.out.print("  ");
					}
					for (int star = 1; star <= (declineCount - i + 1) * 2 - 1; star++) {// ����Ǻţ��������ڣ�����-��ǰ������*2-1
						System.out.print("* ");
					}
					System.out.println();
				}

			
		
	}

}
