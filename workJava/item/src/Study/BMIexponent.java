package Study;

public class BMIexponent {
    public static void main(String[] args) {
        double height = 1.72;
        int weight = 70;
        double bmi = weight / (height * height);
        System.out.println("你的身高是" + height + "米，体重是" + weight + "公斤，BMI指数是" + bmi);
        System.out.print("您的体重属于:");
        if (bmi < 18.5) {
            System.out.println("过轻");
        }
        if (bmi >=18.5 && bmi < 24.90) {
            System.out.println("正常");
        }
        if (bmi >= 24.90 && bmi < 29.90) {
            System.out.println("过重");
        }
        if (bmi >= 29.90 && bmi < 34.90) {
            System.out.println("肥胖");
        }
        if (bmi >= 34.90) {
            System.out.println("非常肥胖");
        }
    }
}
