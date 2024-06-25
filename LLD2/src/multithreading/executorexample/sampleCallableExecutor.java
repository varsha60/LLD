package multithreading.executorexample;

import java.util.concurrent.Callable;

public class sampleCallableExecutor implements Callable {

    @Override
    public Object call() throws Exception {
        return 6+7;
    }
}
