package number;

public class Restaurant {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("welcome!");
		int count = 9;
		System.out.println(count+"��");
		if (count<=4) {
			System.out.println("4����");
		}else if(count>4&&count<=8){
			System.out.println("8����");
		}else if(count>8&&count<=16) {
			System.out.println("����");
		}else {
			System.out.println("Sorry");
		}
	}

}
