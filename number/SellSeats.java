package number;

public class SellSeats {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=10;j++) {
				if (i==1||i==4) {
					continue;
				}System.out.println("��"+i+"��,��"+j+"����λ������");
			}
		}
	}

}
