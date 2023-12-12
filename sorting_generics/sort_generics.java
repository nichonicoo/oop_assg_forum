package sorting_generics;

public class sort_generics{
	
	public static <T extends Comparable<T>> void sortGen(T[] a) {
   
	int x = a.length;	
	
    for (int i = 0; i < x - 1; i++) {
        for (int j = 0; j < x - i - 1; j++) {
        	
            if (a[j].compareTo(a[j + 1]) > 0) {
                swapping(j, j + 1, a);
            }
        }
    }

    for (T i : a)	// for print
    {
        System.out.print(i + ", ");
    }
    System.out.println();
	
}

	public static <T> void swapping(int i, int j, T[] a){	// for swap
		
    T t = a[i];
    a[i] = a[j];
    a[j] = t;
    
	}

}
