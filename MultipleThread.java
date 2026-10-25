// lab 6
class Thread1 extends Thread {
    public void run() {
        System.out.println("Thread 1 is running");
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("Thread 2 is running");
    }
}

public class MultipleThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}