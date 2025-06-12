package Servers.Paterns.Bridge;

interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Запуск бензинового двигателя");
    }
}

class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Запуск электрического двигателя");
    }
}

abstract class Vehicle {
    protected Engine engine;

    protected Vehicle(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();
}

class Car extends Vehicle {
    public Car(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.print("Автомобиль ");
        engine.start();
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.print("Мотоцикл ");
        engine.start();
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle carWithPetrolEngine = new Car(new PetrolEngine());
        carWithPetrolEngine.drive();

        Vehicle motorcycleWithElectricEngine = new Motorcycle(new ElectricEngine());
        motorcycleWithElectricEngine.drive();
    }
}