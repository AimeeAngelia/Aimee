package number;
import java.util.Scanner;
public class Year {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String zodiac="";
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your birth year to find the zodiac sign:");
		int year = s.nextInt();
		year=(((year-1900)%12)+1);
		switch(year) {
		case 1:
			zodiac="��-�ӣ�Rat��";
			break;
		case 2:
			zodiac="ţ-��Ox��";
			break;
		case 3:
			zodiac="��-����Tiger��";
			break;
		case 4:
			zodiac="��-î��Rabbit��";
			break;
		case 5:
			zodiac="��-����Dragon��";
			break;
		case 6:
			zodiac="��-�ȣ�Snake��";
			break;
		case 7:
			zodiac="��-�磨Horse��";
			break;
		case 8:
			zodiac="��-δ��Goat��";
			break;
		case 9:
			zodiac="��-�꣨Monkey��";
			break;
		case 10:
			zodiac="��-�ϣ�Rooster��";
			break;
		case 11:
			zodiac="��-�磨Dog��";
			break;
		case 12:
			zodiac="��-����Pig��";
			break;
		default:
			System.out.println("Error!");
		}
		System.out.println(zodiac);
		s.close();
	}

}
