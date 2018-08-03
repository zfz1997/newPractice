package sort;

public class insertSort {
       private int[] arrays;

	public insertSort(int[] arrays) {
		super();
		this.arrays = arrays;
	}
       public int[] sortSmalltoBig() {
    	   for(int i=1;i<arrays.length;i++) {
    		   int target=arrays[i];
    		   int j=i;
    		   while(j>0&&target<arrays[j-1]) {
    			   arrays[j]=arrays[j-1];
    			   j--;
    		   }
    		   arrays[j]=target;
    	   }
    	   
    	   
    	   
    	   return arrays;
       }
}
