package sort;

public class TextDemo {
      public static void main(String[] args) {
		int[] a= {59,82,77,69,12,15,48,97,64,53,29};
		
		insertSort iS=new insertSort(a);
		iS.sortSmalltoBig();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
