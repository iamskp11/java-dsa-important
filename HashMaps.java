import java.util.HashMap;

// With HashMap, we can achieve an average time complexity of O(1) for the put and get operations and space complexity of O(n).
// C++ : unordered_map<int,int> 

public class HashMaps {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		for(int i=1;i<=10;i++) hm.put(i, i+"x");
		
		for(int i=1;i<=15;i++) {
			if(hm.containsKey(i)) {
				System.out.print(i+" exists value is " + hm.get(i));
			}
			else System.out.print("Does not exists for "+ i);
			System.out.println();
		}

		hm.remove(10);
	}
}
