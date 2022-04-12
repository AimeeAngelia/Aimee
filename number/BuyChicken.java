package number;

public class BuyChicken {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int cock=5;
		int hen=3;
		int chicken=1;
		for(int cockNumber=1;cockNumber<=20;cockNumber++) {
			for(int henNumber=1;henNumber<=34;henNumber++) {
				for(int chickenNumber=3;chickenNumber<=100;chickenNumber+=3) {
					if(cockNumber+henNumber+chickenNumber==100) {
						if(cock*cockNumber+hen*henNumber+chicken*(chickenNumber/3)==100) {
							System.out.println("There are "+cockNumber+" roosters, "+henNumber+" hens, and "+chickenNumber+" chicks.");
						}
					}
				}
			}
		}
	}

}
