package how2j000class000object;

/**
 * @author 天马行空
 */
public class Fish extends AbstractAnimal implements Uml.Pet{
    private String name;

    protected Fish()
    {
        super(0);
    }

    @Override
    public void walk()
    {
        System.out.println("fish can swimming");
    }

    @Override
    public void eat() {
        System.out.println("fish is eating");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void play() {
        System.out.println("fish is playing");
    }
}
