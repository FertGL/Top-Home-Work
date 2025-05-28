package Servers.Paterns.Adapter;

interface CurrencyConverter {
    double convert(double amount);
}

class EvroToDollarConverter implements CurrencyConverter {

    @Override
    public double convert(double euro) {
        return euro * 1.1356;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
