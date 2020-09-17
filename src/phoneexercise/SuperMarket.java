package phoneexercise;

public class SuperMarket {
    public static void main(String[] args) {
        // 用 new 操作符创建一个类的实例/对象 ，实例名字为m1
        // m1 是一个 phoneexercise.MerchandiseExample 类型的引用 ， 只能指向 phoneexercise.MerchandiseExample 类型的实例
        // TODO 只有相同类型的 引用 才可以相互赋值 如： m1 = m2
        //TODO 类 是 对象 的模板 ，对象 是 类 的一个实例
        // TODO  phoneexercise.MerchandiseExample 是一个引用类型  ***作用类似于 int char double之类的***
        MerchandiseExample m1 = new MerchandiseExample();

        // 用 new 操作符再创建一个类的实例/对象 ，实例名字为m2
        MerchandiseExample m2 = new MerchandiseExample();
        MerchandiseExample m4 = new MerchandiseExample();
        System.out.println(m2==m4);

        //TODO 也可以创建一个数组，数组中的每一个元素都是一个 类
        // 说明该数组有 10 个类
        MerchandiseExample[] m3 = new MerchandiseExample[10];
        //TODO 为数组中的每一个元素 创建一个 实例
        m3[0] = new MerchandiseExample();
        m3[1] = new MerchandiseExample();

        //TODO 给数组中的第一个元素赋值 ，第一个元素也就是 一个类
        m3[0].name = "laptop";
        System.out.println(m3[0].name);
        System.out.println(m3[1].name);
        System.out.println("数组长度"+m3.length);
    }
}
