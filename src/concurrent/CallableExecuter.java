package concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExecuter {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CallableTask task = new CallableTask();
		 ExecutorService executor = Executors.newSingleThreadExecutor();
		 Future<Integer> future= executor.submit(task);
		 System.out.println("Retrive the thread value " + future.get());
		 executor.shutdown();
		 
		 
		 
		 
		

	}
}
