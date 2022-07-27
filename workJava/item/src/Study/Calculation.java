package Study;

public class Calculation {
    public static void main(String[] args) {
        int boys = 15;
        int girls = 17;
        int totle = boys + girls;
        boolean result1 = ((boys>girls)&(totle>30));
        boolean result2 = ((boys>girls)||(totle>30));
        System.out.println("男生的人数大于女生并且总人数30人："+result1);
        System.out.println("男生的人数大于女生或总人数30人："+result2);
    }
}
