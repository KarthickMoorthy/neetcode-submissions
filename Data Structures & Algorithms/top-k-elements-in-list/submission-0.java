class Solution {
 public
  int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> lookup = new HashMap<>();

    // Step 1:  Frequency map
    for (int num : nums) {
      lookup.put(num, lookup.getOrDefault(num, 0) + 1);
    }

    // Step 2: Min heap ordered by frequency
    PriorityQueue<Integer> minHeap =
        new PriorityQueue<>((a, b)->lookup.get(a) - lookup.get(b));

    for (int num : lookup.keySet()) {
      minHeap.offer(num);

      if (minHeap.size() > k) {
        minHeap.poll();  // remove least frequent
      }
    }

    // Step 3: Extract result
    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
      result[i] = minHeap.poll();
    }

    return result;
  }
}
