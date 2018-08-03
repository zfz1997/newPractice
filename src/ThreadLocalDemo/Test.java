package ThreadLocalDemo;

public class Test {
public static void main(String[] args) {
	MyThreadLocal mtl1=new MyThreadLocal();
	MyThreadLocal mtl2=new MyThreadLocal();
	MyThreadLocal mtl3=new MyThreadLocal();
	mtl1.start();
	mtl2.start();
	mtl3.start();
}
}
