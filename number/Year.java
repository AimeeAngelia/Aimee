package number;
import java.util.Scanner;
public class Year {

	public static void main(String[] args) {
		// TODO ×Ô¶¯Éú³ÉµÄ·½·¨´æ¸ù
		String zodiac="";
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your birth year to find the zodiac sign:");
		int year = s.nextInt();
		year=(((year-1900)%12)+1);
		switch(year) {
		case 1:
			zodiac="Êó-×Ó£¨Rat£©";
			break;
		case 2:
			zodiac="Å£-³ó£¨Ox£©";
			break;
		case 3:
			zodiac="»¢-Òú£¨Tiger£©";
			break;
		case 4:
			zodiac="ÍÃ-Ã®£¨Rabbit£©";
			break;
		case 5:
			zodiac="Áú-³½£¨Dragon£©";
			break;
		case 6:
			zodiac="Éß-ËÈ£¨Snake£©";
			break;
		case 7:
			zodiac="Âí-Îç£¨Horse£©";
			break;
		case 8:
			zodiac="Ñò-Î´£¨Goat£©";
			break;
		case 9:
			zodiac="ºï-Éê£¨Monkey£©";
			break;
		case 10:
			zodiac="¼¦-ÓÏ£¨Rooster£©";
			break;
		case 11:
			zodiac="¹·-Ðç£¨Dog£©";
			break;
		case 12:
			zodiac="Öí-º¥£¨Pig£©";
			break;
		default:
			System.out.println("Error!");
		}
		System.out.println(zodiac);
		s.close();
	}

}
