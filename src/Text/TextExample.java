package Text;

import java.util.Date;
import java.util.Scanner;

/**
 * JAVADOC 注释
 * @author  Ma Zheng
 * 可以用于给 类 和 方法 加注释
 */
public class TextExample {
    /**
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i;
        int age = 25;
        System.out.println("What is your name ?");
        String name = in.nextLine();
        System.out.println("your name is "+name);

        System.out.println("What is your firstname ?");
        String firstName = in.next();
        System.out.println("your firstname is "+firstName);

        System.out.printf("Hello,%s! your firstname is %s.your age is %d .",name,firstName,age);

        System.out.println(new Date());
    }
}
