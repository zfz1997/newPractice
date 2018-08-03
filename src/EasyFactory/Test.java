package EasyFactory;

public class Test {
          public static void main(String[] args) {
			product pro=Factory.getProduct("apple");
			if(pro!=null) {
				System.out.println(pro.getProduct());
			}
		}
}
