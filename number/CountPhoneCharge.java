package number;

public class CountPhoneCharge {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		double input = 10;
		double everyone_kill = 0.2;
		double time = 30;
		double flow = 10;
		double flow_kill = 0.3;
		System.out.println((input-(everyone_kill*time)-(flow*flow_kill))/everyone_kill+"mins");
	}

}
