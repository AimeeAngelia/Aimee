package number;

public class Poetry {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		char peom[][] = new char[4][];
		peom[0]=new char[]{'��', '��', '��', '��', '��'};
		peom[1]=new char[]{'��', '��', '��', '��', '��'};
		peom[2]=new char[]{'ҹ', '��', '��', '��', '��'};
		peom[3]=new char[]{'��', '��', '֪', '��', '��'};
		System.out.println("---���---");
		for(int i=0;i<peom.length;i++) {
			for(int j=0;j<peom[i].length;j++) {
				System.out.print(peom[i][j]);
			}System.out.println();
		}
		System.out.println("--����--");
		for(int x=0;x<peom[0].length;x++) {
			for(int y=0;y<peom.length;y++) {
				System.out.print(peom[y][x]);
			}System.out.println();
		}
	}

}
