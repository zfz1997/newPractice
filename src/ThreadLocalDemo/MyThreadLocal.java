package ThreadLocalDemo;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThreadLocal extends Thread{
	
	private static AtomicInteger ai=new AtomicInteger();
	
	public synchronized void run() {
		for(int i=0;i<3;i++) {
			Tools.tl.set(ai.addAndGet(1)+"");
			System.out.println(this.getName()+"get value--->"+Tools.tl.get());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
