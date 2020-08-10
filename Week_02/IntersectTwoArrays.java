package Week_01;

public class IntersectTwoArrays {
    public void intersectTwoArrays(int[] nums) {
        HashMap map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], (Integer) map.getOrDefault(nums1[i], 0) + 1);
        }
        int[] result = new int[nums1.length];
        int index = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && (Integer) map.get(nums2[i]) > 0) {
                map.put(nums2[i], (Integer) map.get(nums2[i]) - 1);
                result[index++] = nums2[i];
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }
}
