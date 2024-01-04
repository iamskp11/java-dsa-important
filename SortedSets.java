import java.util.*;


// C++ : set<string>
public class SortedSets {
	public static void main(String[] args) {
		SortedSet<String> st = new TreeSet<>();
		ArrayList<String> arr = new ArrayList<>(Arrays.asList("Setu", "Aditya", "Setu", "Saubhik"));


		for(String ele : arr) st.add(ele);
		System.out.println(st); // [Aditya, Saubhik, Setu]

		if(st.contains("Aditya")) System.out.println("Aditya exists");
		st.remove("Aditya");
		if(st.contains("Aditya") == false) System.out.println("Aditya is removed");
	}
}
