import java.util.*;


public class PriorityQueues {
	public static void main(String[] args) {
		// Min priority queue by default
		PriorityQueue<Integer> pq = new PriorityQueue<> ();
		for(int i=1;i<=100;i++) pq.add(i);

		for(int i=1;i<=10;i++) {
			int x = pq.peek();
			System.out.print(x+" ");
			pq.poll();
		}

		System.out.print("\n");

		// Max priority queue
		PriorityQueue<Integer> max_heap = new PriorityQueue<> (Collections.reverseOrder());
		for(int i=1;i<=100;i++) max_heap.add(i);

		for(int i=1;i<=10;i++) {
			int x = max_heap.peek();
			System.out.print(x+" ");
			max_heap.poll();
		}

		/*
		 * 
		 * https://stackoverflow.com/questions/11003155/change-priorityqueue-to-max-priorityqueue
		 * 
		 * You can provide a custom Comparator object that ranks elements in the reverse order:

			PriorityQueue<Integer> pq = new PriorityQueue<Integer>(defaultSize, new Comparator<Integer>() {
				public int compare(Integer lhs, Integer rhs) {
					if (lhs < rhs) return +1;
					if (lhs.equals(rhs)) return 0;
					return -1;
				}
			});
			Now, the priority queue will reverse all its comparisons, so you will get the maximum element rather than the minimum element.

			Hope this helps!
		 * 
		 */
	}
}
