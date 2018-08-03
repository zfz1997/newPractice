package AccountString;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Account {
      
      public static void accoutString(String[] str) {
    	  
    	  HashMap<String,Integer> hm=new HashMap<String,Integer>();
    	  for(int i=0;i<str.length;i++) {
    		  if(hm.get(str[i])==null) {
    			  hm.put(str[i], 1);
    		  }
    		  else{
    			  hm.put(str[i], hm.get(str[i])+1);
    		  }
    	  }
    	      Set<Entry<String,Integer>> entrys=hm.entrySet();
    	      for(Entry entry:entrys) {
    	    	  System.out.println("字符串"+entry.getKey()+"出现的次数为"+entry.getValue());
    	      }
    	 
      }
}
