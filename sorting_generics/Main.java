package sorting_generics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = { 1, 2, 3};
		//sort<Integer> int_sort = new sort<>();
		
		Double[] doubleArray = { 1.0, 2.0, 3.0};
		//sort<Double> double_sort = new sort<>();
		
		String[] cars = {"abc", "cde", "efg",};
		//sort<String> string_sort = new sort<>();
		
		//int_sort.bubblesort(intArray);
		//double_sort.bubblesort(doubleArray);
		//string_sort.bubblesort(cars);
		
		sort_generics.sortGen(intArray);
		sort_generics.sortGen(doubleArray);
		sort_generics.sortGen(cars);


	}	

}
