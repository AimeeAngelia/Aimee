package number;

public class RepeatNumber {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int bai=0;
		int shi=0;
		int ge=0;
		int number=0;
		for(bai=4;bai<=7;bai++) {
			for(shi=4;shi<=7;shi++) {
				for(ge=4;ge<=4;ge++) {
					if(bai!=shi&&shi!=ge&&bai!=ge) {
						number++;
						System.out.println("���֣�"+(100*bai+10*shi+1*ge));
					}
				}
			}
		}
		System.out.println("������"+number);
	}

}
