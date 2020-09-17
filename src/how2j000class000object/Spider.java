package how2j000class000object;

/**
 * @author 天马行空
 */
public class Spider extends AbstractAnimal {
    protected Spider()
    {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("spider walking");
    }
}
