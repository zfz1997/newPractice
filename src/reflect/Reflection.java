package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
   public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	Person a=new Person();
	Class<?> instance=a.getClass();
	Object b=instance.newInstance();
	for(Field field:instance.getDeclaredFields()) {
		/*String a1=field.getName().substring(0,1).toUpperCase();
		String b1=field.getName().substring(1);
		String c1=a1+b1;
		System.out.println(c1);
		try {
			Method method=instance.getDeclaredMethod("get"+c1,new Class[] {} );
			System.out.println(method.invoke(b, new Object[] {}));
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		field.setAccessible(true);
		System.out.println(field.get(b));
	}
}
}



class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		this.name="aaa";
		this.age=15;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}