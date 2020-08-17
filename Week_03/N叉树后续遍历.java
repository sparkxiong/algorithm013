package Week_03;

public class InvertTree {
    //直接参考老师的模版
    //二叉树：左->右->根
    //N叉树：子节点->根

    List<Integer>  res = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        //树遍历模版
        if (root == null) {
            return res;
        }
        for (Node node : root.children) {
            postorder(node);
        }
        res.add(root.val);
        return res;
    }

    //迭代方法，
    List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
        return res;
    }
    Deque<Node> deque = new ArrayDeque<>();
        deque.push(root);
        while (!deque.isEmpty()) {
        Node current = deque.pop();
        for (Node node : current.children) {
            deque.push(node);
        }
        res.add(current.val);
    }
        Collections.reverse(res);
        return res;

}
