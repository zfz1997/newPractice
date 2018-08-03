package threadDemo;

public class MyThread2 extends Thread{
	private ThreadDemo td;
	
	public MyThread2(ThreadDemo td) {
		this.td = td;
	}
	
	
	public void run() {
		try {
			td.rightLeft();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         }
}
