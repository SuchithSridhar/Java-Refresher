class Multithreading{
	public static void main(String[] args){
		System.out.println("Multithreading example");
		MyThread t1 = new MyThread(12);
		MyThread t2 = new MyThread(56);
		t1.start();
		t2.start();
	}
}
/*
 * These are some methods of Thread class
 * start() stop() sleep(time) 
 * suspend() blocked till further command
 * wait() blocked till certain condition
 * yeild() to activate specific thread
 * resume() for suspend
 * notify() used to schedule a run in sleep
 * notifyAll() wake all threads
 * setPriority(int Number) min-1 normal-5 max-10
 *
 * Exceptions:
 * ThreadDeath
 * InterruptedException
 * IllegalArgumentException
 * IllegalThreadStateException
 *
 * threadName.getId();
 * Thead.currentThread().getId(); currently running thread
 */
class MyThread extends Thread {
	int end;
	MyThread(int finish){
		end = finish;
	}
	public void run(){
		for(int i=end-10;i<=end;i++){
			System.out.println("Current number: " + i);
		}
	}
}


/*
 * Synchoronization 
 * A way of saying: if you start running don't yeild till your'e done
 */

class ExampleSync {
	synchronized void update(){
		// run some code like open and closing files
		System.out.println("This is synchronized code");
	}
	void exampleFunction(someObject){
		synchronized (someObject){
			// block of code sync
		}
		// someObject - may be 'this' or any object
	}
}



class MyThead2 implements Runnable{
	public void run(){
		System.out.println("This is runnable interface extended class thread");
	}
}

class RunnableTest{
	public static void test(){
		MyThread2 runnable = new MyThread2();
		Thread threadx = new Thread(runnable);
		threadx.start();
	}
}








