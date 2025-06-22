package Servers.Paterns.AbstractFactory;

interface ProductA {
    void use();
}

interface ProductB {
    void use();
}

class ConcreteProductA1 implements ProductA {
    @Override
    public void use() {
        System.out.println("Используется продукт A1");
    }
}

class ConcreteProductA2 implements ProductA {
    @Override
    public void use() {
        System.out.println("Используется продукт A2");
    }
}

class ConcreteProductB1 implements ProductB {
    @Override
    public void use() {
        System.out.println("Используется продукт B1");
    }
}

class ConcreteProductB2 implements ProductB {
    @Override
    public void use() {
        System.out.println("Используется продукт B2");
    }
}

interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}

class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}

class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();
        productA1.use();
        productB1.use();

        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();
        productA2.use();
        productB2.use();
    }
}
