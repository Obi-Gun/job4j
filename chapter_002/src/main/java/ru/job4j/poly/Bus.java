package ru.job4j.poly;

public class Bus implements Transport {

    private int numberOfPassengers;
    private final int price = 45;

    @Override
    public void go() {
        this.goForward();
        this.stop();
        this.passengers(10);
        this.goForward();
    }

    private void goForward() {
    }
    private void stop() {
    }

    @Override
    public void passengers(int numberOfPassengers) {
        this.numberOfPassengers += numberOfPassengers;
    }

    @Override
    public int refuel(int liters) {
        return liters * this.price;
    }
}
