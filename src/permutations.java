import java.util.ArrayList;
import java.util.List;

public class permutations {


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), nums, 0);
        return res;
    }

    void helper(List<List<Integer>> res, List<Integer> cur, int[] nums, int idx) {
        if(idx == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for(int i = idx; i < nums.length; i++) {
            swap(nums, idx, i);
            cur.add(nums[idx]);
            helper(res, cur, nums, idx + 1);
            cur.remove(cur.size() - 1);
            swap(nums, idx, i);
        }
    }

    void swap( int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }


    public static void main(String[] args) {

        permutations p=new permutations();
        int [] arr={1,2,3};
        p.permute(arr);
    }

}
