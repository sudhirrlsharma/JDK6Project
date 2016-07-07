package concurrent;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<Integer> {

	int i = 0;
	@Override
	public Integer call() throws Exception {
		i++;
		System.out.println("I am in callable " +i);
		return i;
	}

}
