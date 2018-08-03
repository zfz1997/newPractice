package EasyFactory;

public class Factory {
      private static product pro=null;
	  public static product getProduct(String str) {
		   if(str.equals("apple")) {
			   pro=new Apple();
		   }else if(str.equals("banana")) {
			   pro=new Banana();
		   }
		   return pro;
	  }
	
}


interface product{
	public String getProduct(); 
}

class Apple implements product{

	@Override
	public String getProduct() {
		String str="�õ���һ��ƻ��";
		return str;
	}
	
}

class Banana implements product{

	@Override
	public String getProduct() {
		String str="�õ���һ���㽶";
		return str;
	}
	
}