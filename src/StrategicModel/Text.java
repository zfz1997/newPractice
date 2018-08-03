package StrategicModel;

public class Text {
    public static void main(String[] args) {
		int[] a= {16,18,97,54,87,19,13,16,84,96,52};
		SortFactory SF=new SortFactory(new BigToSmallSort(a));
		a=SF.sort();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		SF=new SortFactory(new SmallToBigSort(a));
		a=SF.sort();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
}
