package multithreading.executorexample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new sampleRunnableExecutor());
        //this can be rewritten using lambda expression as we have runnable as functional interface
        executorService.submit(() -> System.out.println("Hello from sample executor lambda"));

        Future submit = executorService.submit(new sampleCallableExecutor());
        //this can be rewritten using lambda expressions as we have callable as functional interface
        Future submitLambda = executorService.submit(()->6+8);
        System.out.println("Submit from sample callable: "+submit.get());
        System.out.println("Submit from sample callable lambda: "+submitLambda.get());

    }
}
