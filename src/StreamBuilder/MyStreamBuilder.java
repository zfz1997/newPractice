package StreamBuilder;

import java.util.Arrays;

public class MyStreamBuilder {
       private char[] sb=null;
       private int count=0;
       public MyStreamBuilder append(String str) {
    	   
    	   int length=str.length();
    	   ensureCapacity(length+count);
    	   str.getChars(0, str.length(), sb, count);
    	   count+=length;
    	   
    	   return this;
    	   
       }
       public int getCapacity() {
    	   return sb.length;
       }
       
       public int getLength() {
    	   return count;
       }
       public String toString() {
    	   return new String(sb,0,count);
       }
	public MyStreamBuilder(int i) {
		sb=new char[16+i];
	}
	public MyStreamBuilder() {
		sb=new char[16];
	}
	private void ensureCapacity(int capacity) {
		 int oldCapacity=sb.length;
		 if(capacity>oldCapacity) {
		 int newCapacity=oldCapacity*2;
		 while(newCapacity<capacity) {
			 newCapacity*=2;
		 }
		 sb=Arrays.copyOf(sb, newCapacity);
		 }
	}
}
