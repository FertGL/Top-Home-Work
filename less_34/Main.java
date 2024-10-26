package less_34;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Кот");
        Dog dog = new Dog("Собака");
        Bird bird = new Bird("Пингвин", false);
        Animal cat1 = new Cat("Кот");
        Animal dog1 = new Dog("Собака");
        Animal bird1 = new Bird("Попугай", true);

        Animal[] animals = {cat, dog, bird, cat1, dog1, bird1};

        for (Animal animal : animals) {
            System.out.print(animal.getName() + " - ");
            animal.makeSound();
            System.out.print(animal.getName() + " - ");
            animal.move();
            System.out.print(animal.getName() + " - ");
            animal.eat();
            if (animal instanceof Petable) {
                ((Petable) animal).play();
                ((Petable) animal).beFriendly();
            }
        }

    }
}
