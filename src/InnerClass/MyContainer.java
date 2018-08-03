package InnerClass;

import java.util.ArrayList;
import java.util.List;

public class MyContainer {
     private List<InnerContainer> list=new ArrayList<InnerContainer>();
     public void set(int key,int value) {
    	 InnerContainer IC=new InnerContainer(key, value);
    	 list.add(IC);
     }
     public void read() {
    	 for(InnerContainer ic:list) {
    		 System.out.println("key:"+ic.getKey()+" value:"+ic.getValue());
    	 }
     }
	
	
	
	 public static class InnerContainer{
    	 private int key;
    	 private int value;
		public int getKey() {
			return key;
		}
		
		public int getValue() {
			return value;
		}
		
		public InnerContainer(int key, int value) {
			super();
			this.key = key;
			this.value = value;
		}
     }
}
