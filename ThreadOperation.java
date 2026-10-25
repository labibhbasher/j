//lab 5
class MyThread extends Thread {

    boolean suspended = false;
    boolean stopped = false;

    public void run() {

        for (int i = 1; i <= 20 && !stopped; i++) {

            while (suspended) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }

            System.out.println("Thread: " + i);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }

    void suspendThread() {
        suspended = true;
    }

    void resumeThread() {
        suspended = false;
    }

    void stopThread() {
        stopped = true;
    }
}

public class ThreadOperation {

    public static void main(String[] args) throws Exception {

        MyThread t = new MyThread();

        t.start();

        Thread.sleep(2000);

        t.suspendThread();
        System.out.println("Thread Suspended");

        Thread.sleep(2000);

        t.resumeThread();
        System.out.println("Thread Resumed");

        Thread.sleep(2000);

        t.stopThread();
        System.out.println("Thread Stopped");
    }
}