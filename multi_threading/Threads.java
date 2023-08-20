/*Write a JAVA program which will generate the threads:
- To display 20 terms of Fibonacci series.
- To display 1 to 9999 in reverse order.
*/


package multi_threading;

public class Threads extends Thread{

	public static void main(String[] args) {
		Threads obj = new Threads();
		obj.start();
	}
	
	
	// Thread use run method for execute 
	public void run() {
		fibonacci();
		reverse();
	}
	
	
	
	// fibonacci series
	public void fibonacci() {
		int n = 20, n1 = 0, n2 = 1, nextTerm;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(n1 + ", ");

	      nextTerm = n1 + n2;
	      n1 = n2;
	      n2 = nextTerm;
	    }
	    
	    // sleep for 2s after execute function
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("\n");
	}
	
	
	
	// Reverse number print
	public void reverse() {
		for(int i=9999; i>=1; i--) {
			System.out.println("i = "+ i);
			 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}