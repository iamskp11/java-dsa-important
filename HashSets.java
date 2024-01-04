import java.util.*;

// C++ : unordered_set<string>

public class HashSets {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();

		ArrayList<String> arr = new ArrayList<>(Arrays.asList("Setu", "Setu", "Saubhik"));

		for(String ele : arr) {
			hs.add(ele);
		}
		System.out.print(hs);

		for(String i : hs) {
			System.out.print(i+" ");
		}

		if(hs.contains("Saubhik")) System.out.println("Saubhik exists");
		if(hs.contains("Aditya") == false) System.out.println("Aditya do not exists");
	}
}