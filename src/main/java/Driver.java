kodingan 2 

class Counter {
    private int count;

    public Counter() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }
}

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        System.out.println("Count: " + counter.getCount());

        counter.increment();

        System.out.println("Count: " + counter.getCount());

        counter.decrement();

        System.out.println("Count: " + counter.getCount());
    }
}
