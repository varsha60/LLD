package multithreading.basicthreadexample;

public class SimpleThread  implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from simple thread");
    }
}
