package number;

public class Tautog {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int arr[][]= new int[][]{
				{4,3},{1,2}
		};
		System.out.println("�����Ԫ����:");
		int i =0;
		for(int x[]:arr) {
			i++;
			int j=0;
			for(int e :x) {
				j++;
				if (i==arr.length&&j==x.length) {
					System.out.print(e);
				}else {
					System.out.println(e+"��");
				}
			}
		}
	}

}
