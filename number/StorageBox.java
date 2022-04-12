package number;

public class StorageBox {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int box[]=new int[] {
			2,3,5,8,12,13,16,19,20	
		};
		System.out.println("有"+box.length+"个箱子未使用");
		System.out.println("有"+(20-box.length)+"个箱子已使用");
	}

}
