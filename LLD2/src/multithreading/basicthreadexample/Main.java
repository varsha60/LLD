package multithreading.basicthreadexample;

public class Main {

    public static void main(String[] args) {

        SimpleThread simpleThread = new SimpleThread();
        for (int i=0; i<10; i++) {
            Thread thread = new Thread(simpleThread);
            System.out.println("Thread: "+thread.getName());
            thread.start();
        }

    }
}
