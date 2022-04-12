package number;

public class Tautog {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int arr[][]= new int[][]{
				{4,3},{1,2}
		};
		System.out.println("数组的元素是:");
		int i =0;
		for(int x[]:arr) {
			i++;
			int j=0;
			for(int e :x) {
				j++;
				if (i==arr.length&&j==x.length) {
					System.out.print(e);
				}else {
					System.out.println(e+"、");
				}
			}
		}
	}

}
