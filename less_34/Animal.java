package less_34;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract public void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public void eat();

    abstract public void move();

}
