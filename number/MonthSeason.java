package number;
import java.util.Scanner;
public class MonthSeason {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
			Scanner s = new Scanner(System.in);
			System.out.print("Enter month to find season:");
			int month = s.nextInt();
			switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("����");
				break;
			default:
				System.out.println("Wrong!");
			
		}s.close();
	}

}
