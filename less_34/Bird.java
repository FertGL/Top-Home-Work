package less_34;

public class Bird extends Animal {
    protected boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Чик-чирик");
    }

    @Override
    public void eat() {
        System.out.println("Ест семена");
    }

    @Override
    public void move() {
        if (this.canFly) {
            System.out.println(getName() + " летит");
        } else {
            System.out.println(getName() + " не летает(");
        }
    }
}
