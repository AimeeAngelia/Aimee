package number;

public class BreakInsideNested {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Loop:for(int i=1;i<=3;i++) { //外层循环添加Loop标签
			for(int j=1;j<=5;j++) {
				if(j==4) {
					break Loop;
				}System.out.println("i="+i+"j="+j);
			}
		}
	}

}
