package inheritance;

/**
 * 必须有 构造器
 */

public class Manager extends Employee
{
   private double bonus;

    public Manager(String name, double salary, int year, int month, int day)
    {
        super(name, salary, year, month, day);
        //bonus 也得赋初值
        bonus = 0;
    }

    @Override
    public double getSalary()
    {
        //上面的 getSalary 方法 属于方法覆盖
        //此处的 baseSalary 用于存 父类的 方法的值
       double baseSalary = super.getSalary();
       return baseSalary + bonus ;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

}
