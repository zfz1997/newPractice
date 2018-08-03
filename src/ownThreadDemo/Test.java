package ownThreadDemo;

public class Test {
        public static void main(String[] args) {
			ThreadPractice bank=new ThreadPractice();
			Thread1 thread1=new Thread1(bank);
			thread1.start();
			Thread2 thread2=new Thread2(bank);
			thread2.start();
			
		}
}
