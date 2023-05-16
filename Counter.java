package src.main.java;

public class Counter {

    private int count;

    public Counter() {
        this.reset();
    }

    public void reset() {
        count = 0;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    // Mengubah metode getCount menjadi sebuah variabel
    public int getCount; {
        return count;
    }

}