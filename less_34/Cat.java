package less_34;

public final class Cat extends Animal implements Petable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу");
    }

    @Override
    public void eat() {
        System.out.println("Ест рыбу");
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
        System.out.println(getName() + " облизывает тебя");
    }
}
