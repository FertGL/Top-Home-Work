package less_34;

public final class Dog extends Animal implements Petable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав");
    }

    @Override
    public void eat() {
        System.out.println("Ест кость");
    }

    @Override
    public void move() {
        System.out.println(getName() + " бежит");
    }

    @Override
    public void play() {
        System.out.println("Играемся с " + getName());
    }

    @Override
    public void beFriendly() {
        System.out.println(getName() + " виляет хвостом");
    }
}
