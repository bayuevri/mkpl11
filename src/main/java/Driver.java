class Counter {
    private int count;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        System.out.println("Count: " + counter.getCount());

        counter.increment();

        System.out.println("Count: " + counter.getCount());

        counter.decrement();

        System.out.println("Count: " + counter.getCount());
    }
