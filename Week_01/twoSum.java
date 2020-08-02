package Week_01;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{(Integer) map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
