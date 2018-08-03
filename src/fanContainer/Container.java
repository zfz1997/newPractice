package fanContainer;

import java.util.Arrays;

public class Container<T> {
     private Object[] obj=null;
     private int size;
	public Container() {
		obj=new Object[10];
	}
    public Container(int i) {
    	obj=new Object[i];
    }
    public int size() {
    	return obj.length;
    }
    public void add(T str){
    	ensureCapacity(size+1);	
    	obj[size++]=str;
    	}
    @SuppressWarnings("unchecked")
	public T get(int i) {
    	return (T)obj[i];
    }
    private void ensureCapacity(int capacity) {
    	if(capacity>obj.length) {
    		int oldCapacity=obj.length;
    		int newCapacity=oldCapacity*2;
    		obj=Arrays.copyOf(obj, newCapacity);
    	}
    }
    }

