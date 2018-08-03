package yanzhengma;

import java.util.Random;

public class Code {
       private static String[] str= {"a","b","c","d","e","f","g",
    		   "h","i","j","k","l","m","n","o","p","q","r"
    		   ,"s","t","u","v","w","x","y","z","0","1","2"
    		   ,"3","4","5","6","7","8","9"};
      public static String getCode() {
    	   Random R=new Random();
    	   StringBuilder sb=new StringBuilder();
    	   while(true) {
    		   String s=str[R.nextInt(36)];
    		   if(sb.indexOf(s)==-1) {
    			   sb.append(s);
    			   
    		   }
    		   if(sb.length()==4)
    			   break;
    	   }
    	  
    	  
    	  return sb.toString();
      }
}
