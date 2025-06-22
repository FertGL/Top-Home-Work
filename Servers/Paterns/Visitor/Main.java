package Servers.Paterns.Visitor;

interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}

class Keyboard implements ComputerPart {
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}

class Monitor implements ComputerPart {
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}

class Mouse implements ComputerPart {
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}

class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] { new Keyboard(), new Monitor(), new Mouse() };
    }

    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}

interface ComputerPartVisitor {
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
    void visit(Mouse mouse);
    void visit(Computer computer);
}

class PriceCalculator implements ComputerPartVisitor {
    private double totalPrice = 0;

    public void visit(Keyboard keyboard) {
        totalPrice += 50;
        System.out.println("Клавиатура: 50");
    }

    public void visit(Monitor monitor) {
        totalPrice += 150;
        System.out.println("Монитор: 150");
    }

    public void visit(Mouse mouse) {
        totalPrice += 20;
        System.out.println("Мышь: 20");
    }

    public void visit(Computer computer) {
        System.out.println("Общая стоимость компьютера: " + totalPrice);
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        PriceCalculator calculator = new PriceCalculator();

        computer.accept(calculator);

        System.out.println("Общая цена: " + calculator.getTotalPrice());
    }
}
