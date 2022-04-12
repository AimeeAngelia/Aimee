package number;

public class Poetry {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		char peom[][] = new char[4][];
		peom[0]=new char[]{'春', '眠', '不', '觉', '晓'};
		peom[1]=new char[]{'处', '处', '闻', '啼', '鸟'};
		peom[2]=new char[]{'夜', '来', '风', '语', '声'};
		peom[3]=new char[]{'花', '落', '知', '多', '少'};
		System.out.println("---横板---");
		for(int i=0;i<peom.length;i++) {
			for(int j=0;j<peom[i].length;j++) {
				System.out.print(peom[i][j]);
			}System.out.println();
		}
		System.out.println("--竖版--");
		for(int x=0;x<peom[0].length;x++) {
			for(int y=0;y<peom.length;y++) {
				System.out.print(peom[y][x]);
			}System.out.println();
		}
	}

}
