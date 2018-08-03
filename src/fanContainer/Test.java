package fanContainer;

public class Test {
public static void main(String[] args) {
	Container<Integer> number=new Container<Integer>(1);
	System.out.println(number.size());
	number.add(1);
	number.add(2);
	number.add(3);
	System.out.println(number.get(0));
	System.out.println(number.size());
}
}
