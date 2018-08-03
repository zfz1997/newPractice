package sort;

public class chooseSort {
      private int[] arrays;

	public chooseSort(int[] arrays) {
		super();
		this.arrays = arrays;
	}
	
	public int[] sortBigtoSmall() {
		
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
public int[] sortSmalltoBig() {
		
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
