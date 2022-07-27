package Study;

public class Demo {
    public static void main(String[] args) {
        /**
         * byte型与float型的转换：
         * byte型与int型的转换：
         * byte型与char型的转换:
         * double型与char型的转换:
         */
        char c1 = '\\';
        char char1 = '\u0022';
        char char2 = '\u2605';
        System.out.println(c1);
        System.out.println(char1);
        System.out.println(char2);
        int x = 0xFF;
        System.out.println(x);
        int x1 = 50;
        float f1 = x1;  // implicit conversion
        System.out.println(f1);
        byte b1 = (byte)129; // explicit conversion
        System.out.println(b1);
    }
}
