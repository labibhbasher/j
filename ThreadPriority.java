
class A extends Thread {
    public void run() {
        System.out.println(getName() + " is running");
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        A c = new A();

        a.setName("Thread A");
        b.setName("Thread B");
        c.setName("Thread C");

        a.setPriority(1);
        b.setPriority(5);
        c.setPriority(10);

        a.start();
        b.start();
        c.start();
    }
}
