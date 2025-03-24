import java.util.HashMap;

public class MagicPotionEncoding {

    private static HashMap<Integer, Integer> memo = new HashMap<>();

    private static int back(String s, int ind, String pre) {
        if (ind >= s.length()) return 0;
        if (memo.containsKey(ind)) return memo.get(ind);

        int res = Integer.MAX_VALUE;
        int val = s.length() - ind;
        for (int i = 1; i <= s.length(); i++) {
            if (ind + i > s.length()) break;
            if (pre.equals(s.substring(ind, ind + i))) {
                val = 1 + back(s, ind + i, pre + pre);
            } else {
                val = 1 + back(s, ind + 1, pre + s.charAt(ind));
            }
            res = Math.min(res, val);
        }
        memo.put(ind, res);
        return res;
    }

    public static int encode(String s) {
        return back(s, 0, "");
    }

    public static void main(String[] args) {
        String[] inputs = {"ABABCABABCE", "ABCDABCE", "ABCABCE", "AAA", "AAAA", "BBB", "AAAAAA"};
        for (String input : inputs) {
            System.out.println(input + " " + encode(input));
            memo.clear();
        }
    }
}
