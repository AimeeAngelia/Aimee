package number;

public class Calculation {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int boys = 15;
		int girls = 17;
		int totle = boys + girls;
		boolean result1 = ((boys>girls)&&(totle>30));
		boolean result2 = ((boys>girls)||(totle>30));
		System.out.println("boys>girls && totle>30:"+result1);
		System.out.println("boys>girls || totle>30:"+result2);
	}

}
