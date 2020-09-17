package inheritance;

import java.util.Scanner;

public class ManagerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Manager boss = new Manager("Carl Cracker",80000,1987,12,15);

        System.out.println("请输入经理的奖金：");
        double bonus = in.nextDouble();
        boss.setBonus(bonus);

        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
        staff[2] = new Employee("Tommy Tester",40000,1990,3,15);

        // >> TODO e可以自动的指向 父类 子类的同一个方法（子类的方法称为 方法覆盖） ，也称为  多态
        for (Employee e : staff) {
            System.out.println("name: "+e.getName()+",salary: "+e.getSalary()+",hireday: "+e.getHireday());
        }
    }
}
