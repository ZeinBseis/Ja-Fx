package MultiThrd;

class printChar implements Runnable {

	private char toPrint;
	private int times;
	
	public printChar(char c, int t) {
		toPrint = c;
		times = t;
	}

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

	public void run () {
		for (int i = 0; i < lastNum; i++) {
			System.out.print(" "+ i);

		}
	}

}
