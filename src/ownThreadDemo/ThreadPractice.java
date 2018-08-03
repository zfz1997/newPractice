package ownThreadDemo;

public class ThreadPractice {
       private static int money=10000;
       public ThreadPractice() {
    	   super();
       }
       public void saveMoney(int number) {
               if(number<0)
            	   return;
               else {
            	   money+=number;
               }
               
       }
       public synchronized void getMoney(int number) {
    	   if(number<0) {
    		   return;
    	   }
    	   else if(number>money) {
    		   System.out.println("�˻���û����ô��Ǯ");
    	   }
    	   else {
    		   money-=number;
    	   }
       }
       public synchronized int checkMoney() {
    	   return money;
       }
}
