package Study;

import java.util.Scanner;

public class LoginService {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passWord;
        do{
            System.out.print("请输入6位密码:");
            passWord = input.nextInt();
        }while(931572!=passWord);
        System.out.println("登录成功");
        input.close();
    }
}
