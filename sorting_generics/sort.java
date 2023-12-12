package sorting_generics;

public class sort <T extends Comparable<T> >{
	
	public T[] bubblesort(T[] a) {
		
		int b = a.length;
		boolean swapped;
		
		do {
			
			swapped = false;
			for(int i=1; i<b; i++) {
				if(a[i-1].compareTo(a[i]) < 0) {
					T temp = a[i-1];
					a[i-1] = a[i];
					a[i] = temp;
					swapped = true;
				}
			}
		}while(swapped);
		
		System.out.println("sorted: ");
		
		for(T element : a) {
			System.out.println(element + ", ");
		}
		
		return a; 
	}
}
