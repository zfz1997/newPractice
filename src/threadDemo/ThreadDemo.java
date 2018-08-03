package threadDemo;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadDemo {
	 private final Object left=new Object();
	 private final Object right=new Object();
	 
	    public  void leftRight() throws InterruptedException {
	    	synchronized(left) {
	    		Thread.sleep(2000);{
	    			synchronized (right) {
	    				System.out.println("leftRight end!");
						
					}
	    		}
	    	}
	    }
	    public void rightLeft() throws InterruptedException {
	    	synchronized(right) {
	    		Thread.sleep(2000);{
	    			synchronized (left) {
						System.out.println("rightLeft end!");
					}
	    		}
	    	}
	    }

}
