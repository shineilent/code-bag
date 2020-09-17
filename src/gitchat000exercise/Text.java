package gitchat000exercise;

import com.sun.deploy.util.StringUtils;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 天马行空
 */
public class Text {
    public static void main(String[] args) {
//        LocalDateTime today = LocalDateTime.now();
//        LocalDateTime tomorrow = today.plusDays(1);
//        System.out.println(today);
//        System.out.println(tomorrow);
//        LocalDateTime houtian = today.plusDays(2);
//        System.out.println(houtian);
//        myfor:for(int i = 0; i<5; i++)
//        {
//            for (int j = 0; j < 10;j++)
//            {
//                System.out.println("j="+j);
//                if (j == 9)
//                {
//                    break myfor;
//                }
//            }
//        }


        // Integer 高频区缓存范围 -128~127
//            Integer num1 = 127;
//            Integer num2 = 127;
//            // Integer 取值 127 == 结果为 true（值127 num1==num2 => true）
//            System.out.println("值127 num1==num2 => " + (num1 == num2));
//            Integer num3 = 126;
//            Integer num4 = 126;
//            // Integer 取值 128 == 结果为 false（值128 num3==num4 => false）
//            System.out.println("值128 num3==num4 => " + (num3.equals(num4)));


//        Set<Short> set = new HashSet<>();
//        for (short i = 0; i < 5; i++) {
//            set.add(i);
//            set.remove(-2);
//        }
//        System.out.println(set.size());
//        System.out.println(set.toString());

//        short s = 2;
//        s = (short) (s + 2);
//        float f = 0.1f;
//        System.out.println(3*0.1);

//        Integer i1 =  new Integer(10);
//        Integer i2 =  new Integer(10);
//        Integer i3 = Integer.valueOf(10);
//        Integer i4 = Integer.valueOf(10);
//
//        Integer i11 = 10;
//        Integer i22 = 10;
//        int i111 = 10;
//        int i222 = 10;
//        System.out.println(i11 == i22);
//        System.out.println(i111 == i222);
//
//        System.out.println(i1 == i2);
//
//
//        System.out.println(i2 == i3);
//        System.out.println(i3 == i4);

//        int a = 3;
//        int b;
//        b = TextClass.triple(a);
//        System.out.println(b);

//        String s = "asd";
//        String s1 = "llklklk";
//        if(s1.equals("")) {
//            System.out.println("s1为空");
//        }
//        else {
//            System.out.println("s1不为空");
//        }

//        try {
//            int i = 10 / 0;
//            System.out.println("try");
//        } catch (Exception e) {
//            int j = 2 / 0;
//            System.out.println("catch");
//        } finally {
//            System.out.println("finally");
//        }
//        System.out.println("main");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("驱动初始化成功！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }









    }
}
