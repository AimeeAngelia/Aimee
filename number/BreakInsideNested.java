package number;

public class BreakInsideNested {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Loop:for(int i=1;i<=3;i++) { //���ѭ�����Loop��ǩ
			for(int j=1;j<=5;j++) {
				if(j==4) {
					break Loop;
				}System.out.println("i="+i+"j="+j);
			}
		}
	}

}
