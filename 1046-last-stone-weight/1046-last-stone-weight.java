class Solution {
	public int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //max priority queue

		for (int value : stones) {
			pq.add(value);
		}

		while (pq.size() > 1) {
			int first = pq.poll();
			int second = pq.poll();

			if (first != second) {
				pq.add(first - second);
			}
		}
        
        if(pq.size()==0)
            return 0;
        else
            return pq.peek();

	}
}