package Week_01;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        //统计元素的出现次数
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            heap.add(entry);
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = heap.poll().getKey();
        }
        return res;
    }
}
