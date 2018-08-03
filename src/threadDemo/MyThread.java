package threadDemo;

public class MyThread extends Thread{
private ThreadDemo td;
    
    public MyThread(ThreadDemo td)
    {
        this.td = td;
    }
    
    public void run()
    {
        try {
			td.leftRight();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
