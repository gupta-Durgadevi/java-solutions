


class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        find(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }

    void find(int[] arr, int target, int index,
              List<Integer> list, List<List<Integer>> ans) {

        // Target reached
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        // Target crossed
        if (target < 0) {
            return;
        }

        // Try every number
        for (int i = index; i < arr.length; i++) {

            // Take the number
            list.add(arr[i]);

            // Same number can be used again
            find(arr, target - arr[i], i, list, ans);

            // Remove the number
            list.remove(list.size() - 1);
        }
    }
}
