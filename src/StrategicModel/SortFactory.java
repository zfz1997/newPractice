package StrategicModel;

public class SortFactory {
       private Sort s=null;
       
	public SortFactory(Sort s) {
		super();
		this.s = s;
	}
      public int[] sort(){
    	  return s.sort();
      }
}


interface Sort{
	public int[] sort();
}


class BigToSmallSort implements Sort{
	private int[] arrays;

	public BigToSmallSort(int[] arrays) {
		super();
		this.arrays = arrays;
	}
public int[] sort() {
		
		for(int i=0;i<arrays.length-1;i++) {
			int target=i;
			for(int j=i+1;j<arrays.length;j++) {
				if(arrays[target]<arrays[j])
				target=j;
			}
			int flag=arrays[i];
			arrays[i]=arrays[target];
			arrays[target]=flag;
			
			
		}
		
		
		return arrays;
	}
}
class SmallToBigSort implements Sort{
	private int[] arrays;

	public SmallToBigSort(int[] arrays) {
		super();
		this.arrays = arrays;
	}
	@Override
	public int[] sort() {
		for(int i=0;i<arrays.length-1;i++) {
			int target=i;
			for(int j=i+1;j<arrays.length;j++) {
				if(arrays[target]>arrays[j])
				target=j;
			}
			int flag=arrays[i];
			arrays[i]=arrays[target];
			arrays[target]=flag;
			
			
		}
		
		
		return arrays;
	}
}