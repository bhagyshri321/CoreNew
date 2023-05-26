package in.java8.test;

 interface BubbleSort{
	void arr(int[]a);
	
	
}
public class BubbleSortLamda{
	public static void main(String[] args) {
		
		BubbleSort b= l->{
			for(int i=0;i<l.length;i++) {
				for(int j=i+1;j<l.length;j++) {
					if(l[i]>l[j]) {
						int temp= l[i];
						l[i]= l[j];
						l[j]= temp;
					}
				}
				
			}for(int k=0;k<l.length;k++) {
				System.out.print(" "+l[k]);
			}
		};int[] arr= {45,56,34,23,78,12,};
		b.arr(arr);
	}
	
}