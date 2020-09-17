package how2j000class000object;

/**
 * @author 天马行空
 */
public abstract class AbstractAnimal {
    protected int legs;
    protected AbstractAnimal(int legs)
    {
        this.legs = legs;
    }

    /**
     * 记录吃的食物
     */
    public abstract void eat();

    public void walk()
    {
        System.out.println("动物用"+legs+"条腿走路");
    }

}
