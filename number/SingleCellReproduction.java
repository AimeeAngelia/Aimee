package number;

public class SingleCellReproduction {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int sum=0;
		int times = 1;
		for(int i =1;times<=10;times++) {
			System.out.println(i);
			i = i*2;
			sum = i;
		}
		System.out.println(sum);
	}

}
