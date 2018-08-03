package threadDemo;

public class Test {
	public static void main(String[] args) {
	   ThreadDemo td=new ThreadDemo();
	   MyThread mt1=new MyThread(td);
	   MyThread2 mt2=new MyThread2(td);
	   mt1.start();
	   mt2.start();
	}
}