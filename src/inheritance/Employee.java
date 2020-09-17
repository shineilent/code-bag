package inheritance;

import java.io.DataOutput;
import java.time.LocalDate;

/**
 * @author 天马行空
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireday;

    /**
     * 构造器，用于初始化变量的值
      */
    public Employee(String name , double salary , int year , int month , int day)
    {
        //this.name 代表实例字段中的值   name 代表 形参
        this.name = name;
        this.salary = salary;
        hireday = LocalDate.of(year , month , day);
    }

    /**
     * 类中的方法
     */
    public  String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireday()
    {
        return hireday;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
