package Week11;
// Fig. 26.4: TaskExecutor
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor {
	public static void main(String[] args) {
		// create and name each runnable
		PrintTask task1 = new PrintTask("task1");
		PrintTask task2 = new PrintTask("task2");
		PrintTask task3 = new PrintTask("task2");
		
		System.out.println("Starting Executor");
		
		//create ExecutorService to manage threads
		ExecutorService threadExecutor = Executors.newCachedThreadPool();
		
		// start threads and place in runnable state
		threadExecutor.execute(task1); // start task1, task2, task3
		threadExecutor.execute(task2); 
		threadExecutor.execute(task3);
		
		// shut down worker threads when their tasks complete
		threadExecutor.shutdown();
		
		System.out.println("Tasks started, main ends. \n");
	} //end main
} // end class TaskExecutor

