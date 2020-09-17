package phoneexercise;

public class PhoneExample {
    public static void main(String[] args) {
        // 用 phoneexercise.Phone 这个引用数据类型 创建一个 myPhone 的对象
        Phone myPhone = new Phone();
        myPhone.hasFigurePrintUnlocker = true;
        myPhone.price = 2699;

        // TODO myPhone.screen 可以理解为 新创建的对象的 对象名
        myPhone.screen = new Screen();
        myPhone.screen.producer = "京东方";
        myPhone.screen.size = 6.6;

        myPhone.mainboard = new Mainboard();
        myPhone.mainboard.model = "DELL";
        myPhone.mainboard.year = 2020 ;

        /*
        TODO   也可以这么赋值
        TODO   phoneexercise.CPU cpu = new phoneexercise.CPU();

                ...(关于cpu对象的一些操作)
                ...

        TODO    myPhone.mainboard.cpu = cpu;
         */

        myPhone.mainboard.cpu = new CPU();
        myPhone.mainboard.cpu.producer = "高通";
        myPhone.mainboard.cpu.speed = 3.5;

        myPhone.mainboard.memory = new Memory();
        myPhone.mainboard.memory.capacity = 8;
        myPhone.mainboard.memory.producer = "三星";


        myPhone.mainboard.storage = new Storage();
        myPhone.mainboard.storage.capacity = 256;
        myPhone.mainboard.storage.producer = "Intel";

        // TODO  在 类 中可以引用自己的 类
        myPhone.prephone = new Phone();
    }
}
