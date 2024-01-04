import java.util.*;

public class Sorting {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10,9,6,4,3,1,8,7,5,2));

		Collections.sort(arr, new SortByLog());
		System.out.print(arr);
	}
}

// If a before b -> any negative integer 
// If a after b -> any positive integer 
// In short, preserve order -> Negative, else reverse -> Positive
class SortByLog implements Comparator<Integer> {
	public int compare(Integer a , Integer b) {
		if(a%2==b%2) return a-b;
		if(a%2==1) return 1;
		return -1;
	}
}