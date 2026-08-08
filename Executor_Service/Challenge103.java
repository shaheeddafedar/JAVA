

package Executor_Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Challenge103 {
    public static void main(String[] args) {
        NumberThread n1 = new NumberThread();
        ExecutorService execute = Executors.newSingleThreadExecutor();
        execute.submit(n1);
        execute.shutdown();
    }
}
