class Solution {
    public ArrayList<Integer> pattern(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        solve(n, ans);
        return ans;
    }

    private void solve(int n, ArrayList<Integer> ans) {
        ans.add(n);

        if (n <= 0) {
            return;
        }

        solve(n - 5, ans);

        ans.add(n);
    }
}