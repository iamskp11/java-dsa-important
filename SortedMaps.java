import java.util.*;

// C++ : map<int,int>

public class SortedMaps {
	public static void main(String[] args) {
		SortedMap<Integer, String> mp = new TreeMap<>();

		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10,1,4,3,6,2,7,9,8));

		for(Integer ele : arr) {
			mp.put(ele, ele + "x");
		}

		arr.add(11);
		arr.add(12);

		for(Integer ele : arr) {
			if(mp.containsKey(ele)) System.out.print("\nkey "+ele+" has value "+mp.get(ele));
			else System.out.print("\nkey "+ele+"does not exists");
		}
		System.out.println(mp);
	}
}
