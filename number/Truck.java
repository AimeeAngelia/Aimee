package number;

public class Truck {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double l = 400, w = 160, h = 30;// 货箱的长宽高
		double r = 23;// 西瓜的直径
		int lCount = (int) (l / r);// 长可以放下的西瓜数量
		int wCount = (int) (w / r);// 宽可以放下的西瓜数量
		int hCount = (int) (h / r);// 高可以放下的西瓜数量
		System.out.println("货车满载时能装" + (lCount * wCount * hCount) + "个西瓜");
		System.out.println((lCount * wCount * hCount) > 100 ? "货车实际能装100个西瓜" : "货车实际能装" + (lCount * wCount * hCount) + "个西瓜");
	}

}
