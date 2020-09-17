package how2j000class000object;

/**
 * @author 天马行空
 */
public class AnimalDescription {
    public static void main(String[] args) {
        Spider s = new Spider();
        s.eat();
        s.walk();
        System.out.println();

        Cat c = new Cat();
        String catName;
        c.eat();
        c.play();
        c.walk();
        c.setName("Molly");
        catName = c.getName();
        System.out.println(catName);
        System.out.println();

        Fish f = new Fish();
        String fishName;
        f.eat();
        f.play();
        f.walk();
        f.setName("Jimmy");
        fishName = f.getName();
        System.out.println(fishName);

        Uml.Pet.message();
        f.message1();

    }
}
