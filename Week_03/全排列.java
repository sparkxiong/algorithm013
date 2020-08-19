package Week_03;

public class InvertTree {
    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        helper(nums, track);
        return res;
    }

    private void helper(int[] nums, LinkedList<Integer> track) {
        //结束条件
        if (nums.length == track.size()) {
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            //排除不合法选择
            if (track.contains(nums[i])) {
                continue;
            }
            //做选择
            track.add(nums[i]);
            //进入下一层决策树
            helper(nums, track);
            //取消选择
            track.removeLast();
        }
    }
}
