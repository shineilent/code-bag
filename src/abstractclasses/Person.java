package abstractclasses;

public abstract class Person {
    /**
     * 创建一个抽象方法，便于在 main函数中调用
     */
    public abstract String getDescription();
    private String name;
    
    public Person(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
