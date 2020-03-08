package MultiThrd.TaskThread;

class PrintChar implements Runnable {

	private char toPrint;
	private int times;
	
	public PrintChar(char c, int t) {
		toPrint = c;
		times = t;
	}

	@Override
	public void run () {
		for (int i = 0; i < times; i++) {
		System.out.print(toPrint);
		
		}

	}


}


// This task class for printing numbers from 1 to n
class printNum implements Runnable {

	private int lastNum;

	public printNum(int n) {
		lastNum = n;

	}
	
	@Override
	public void run () {
//		Thread t4 = new Thread(new PrintChar('o', 40));
//		t4.start();
//		try{
			for (int i = 0; i < lastNum; i++) {
			System.out.print(" "+ i);
			// When calling yield the Thread is yielded (bollowed) to excute
			// on another task
//			Thread.yield();
			// When modifying sleep the Thread sleeps for n  milliseconds
//			if (i > 50) Thread.sleep(0);
			// Thread.join forces one thread to wait for another to finish
//			if (i == 50) t4.join();
			}
			// InterrruptException occures when Thread.interrupt is called on a sleeping thread
//		}catch (InterruptedException ex){
//			System.out.println(ex.getMessage());

		}
	

}


public class TaskThreadDemo {

	public static void main (String [] args) {

	Runnable printZ = new PrintChar('z', 100);
	Runnable printJ = new PrintChar('j', 100);
	Runnable print100 = new printNum(100);

	Thread t1 = new Thread(printZ);
	Thread t2 = new Thread(printJ);
	Thread t3 = new Thread(print100);

	t1.start();
	t2.start();
	t3.start();
	
	// this isn't working for some reason
//	t3.setPriority(Thread.MAX_PRIORITY);
// when calling a high priority thread, call sleep() or yield() on it to allow lower
// priority threads to excute

//	t1.run();
//	t2.run();
//	t3.run();
// Thread.run doesn't create a new Thread every time it gets called, it actualy
// excutes run() inside the Thread that called the called it, so its not
// multi-threading its just the same thread excuting every time
	}

}
