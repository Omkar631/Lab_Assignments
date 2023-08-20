/* Write a program that creates 2 threads - each displaying a message (Pass the message as a parameter to the constructor).
The threads should display the messages continuously till the user presses ctrl+c.
*/



package multi_threading;

public class Threads_Infinite extends Thread {

	Threads_Infinite() {
		super("infinite till you enter 'CLTR + C'");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threads_Infinite obj = new Threads_Infinite();
		Threads_Infinite obj1 = new Threads_Infinite();
		
		// use start method to execute thread run function.... (Multi-Threading)
		obj.start();
		obj1.start();
	}

	
	// run method from Thread
	public void run() {
		
		// infinite loop until user press "ctrl + c"
		for (int i = 999; i <= 1000; i--) {
			System.out.println("i= " + i);
			
			// every iteration execute after 1000ms.... 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}

}
