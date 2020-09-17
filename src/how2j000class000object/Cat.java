package how2j000class000object;

/**
 * @author 天马行空
 */
public class Cat extends AbstractAnimal implements Uml.Pet {
    private String name;

    public Cat(String name)
    {
        super(4);
        this.name = name;
    }
    public Cat()
    {
        this("");
    }

    @Override
    public void eat()
    {
        System.out.println("cat is eating");
    }

    @Override
    public void setName(String name) {
         this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void play()
    {
        System.out.println("cat is playing");
    }
}
