package how2j000class000object;

/**
 * @author 天马行空
 */
public class Uml {
    public interface Pet
    {
        public void setName(String name);
        public String getName();
        public void play();

        //接口中也可以有静态方法，但必须是加 static 关键字
        public static void message()
        {
            System.out.println("这是一个接口中的静态函数！");
        }

        //接口中也可以有默认方法，但必须是加 default 关键字
        public default void message1()
        {
            System.out.println("这是一个接口中的默认方法！");
        }
    }
}
