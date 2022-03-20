package class_50;
/*
 https://leetcode.com/problems/last-stone-weight/
*/	 

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
	public int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		for (int i : stones) {
			queue.add(i);
		}
		int x = 0;
		int y = 0;
		while (queue.size() > 1) {
			y = queue.poll();
			x = queue.poll();
			if (y > x) {
				queue.offer(y - x);
			}
		}
		return queue.isEmpty() ? 0 : queue.poll();
	}

}
