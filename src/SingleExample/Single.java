package SingleExample;

public class Single {
          private static Single single=null;
          private Single() {
        	 
          }
          public static Single getNewInstance() {
        	  if(single==null) {
        		  single=new Single();
        		  System.out.println("�����˵���ģʽ");
        	  }
        	  else {
        		  
        	  }
        	  return single;
          }
}
