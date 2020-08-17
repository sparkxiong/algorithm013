package Week_03;

public class GENERATEPARENTHESIS {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        generate(0, 0, n, "", res);
        return res;
    }

    private void generate(int left, int right, int n, String s, List<String> res) {
        //terminator
        if (left == n && right == n) {
            res.add(s);
            return;
        }
        //process
        //drill dowm
        if (left < n) {
            generate(left + 1, right, n, s + "(", res);
        }
        if (left > right) {
            generate(left, right + 1, n, s + ")", res);
        }
        //reset result
    }
}
