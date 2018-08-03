package sort;

public class twoSort {
      private int[] arrays;

	public twoSort(int[] arrays) {
		super();
		this.arrays = arrays;
	}
    public int sort(int num,int target) {
    	int left=0;
    	int right=num;
    	int mid=(left+right)/2;
    	while(target!=arrays[mid]) {
    	    if(mid==left) {
    	    	if(target==arrays[right])
    	    	return right;
    	    	else			
    	    	return -1;
    	    }
    	    else if(target>arrays[mid]) {
    	    	left=mid;
    	    	mid=(left+right)/2;
    	    }
    	    else if(target<arrays[mid]) {
    	    	right=mid;
    	    	mid=(left+right)/2;
    	    }
    	}
    	
    	
    	return mid;
    }
}
