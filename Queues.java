import java.util.LinkedList;
import java.util.Queue;


public class Queues {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();

		for(char ch='a'; ch<='z';ch++) {
			String s = ch + "";
			q.add(s);
		}
		
		while(!q.isEmpty()) {
			String s = q.peek();
			q.remove();
			System.out.println(s);
		}

		for(char ch='a'; ch<='z';ch++) {
			String s = ch + "";
			q.add(s);
		}
		System.out.println(q);
		while(!q.isEmpty()) {
			int sz = q.size();

			while(sz-- > 0) {
				String s = q.peek();
				q.remove();
				System.out.print(s+ " ");
			}
		}
	}
}