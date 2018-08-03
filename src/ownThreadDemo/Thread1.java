package ownThreadDemo;

public class Thread1 extends Thread{
       private ThreadPractice bank;
       public Thread1(ThreadPractice bank) {
    	   this.bank=bank;
       }
       public void run() {
    	  
    	   for(int i=0;i<6;i++) {
    		   try {
      				Thread.sleep(1000);
      			} catch (InterruptedException e1) {
      				// TODO Auto-generated catch block
      				e1.printStackTrace();
      			}
    		   bank.getMoney(1000);
    		   System.out.println(Thread.currentThread().getName()+"取出了1000元");
    		   
    		   System.out.println("账户中还剩下"+bank.checkMoney());
    		  
    		   try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	   }
       }
       
}
