package Study;

public class Conver {
    public static void main(String[] args) {
        byte mybyte = 127;
        int myint = 150;
        float myfloat = 452.123f;
        char mychar = 10;
        double mydouble = 45.46546;
        System.out.println("byte型与float型的转换：" + (mybyte + myfloat));
        System.out.println("byte型与int型的转换：" + (mybyte * myint));
        System.out.println("byte型与char型的转换:" + (mybyte / mychar));
        System.out.println("double型与char型的转换:" + (mydouble + mychar));
    }
}
