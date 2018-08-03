package sort;

public class soapSort {
       private int[] arrays;

	public soapSort(int[] arrays) {
		super();
		this.arrays = arrays;
	}
    public int[] sortBigtoSmall() {
    	
    	for(int i=0;i<arrays.length-1;i++)
    	{
    		for(int j=0;j<arrays.length-1-i;j++)
    		{
    			if(arrays[j]<arrays[j+1])
    			{    	
    				int target=arrays[j];
    				arrays[j]=arrays[j+1];
    				arrays[j+1]=target;
    				
    			}
    		}
    	}
    	
    	
		return arrays;
    }
    public int[] sortSmalltoBig() {
    	
    	for(int i=0;i<arrays.length-1;i++)
    	{
    		for(int j=0;j<arrays.length-1-i;j++)
    		{
    			if(arrays[j]>arrays[j+1])
    			{    	
    				int target=arrays[j];
    				arrays[j]=arrays[j+1];
    				arrays[j+1]=target;
    				
    			}
    		}
    	}
    	
    	
    	return arrays;
    }
}
