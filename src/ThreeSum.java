import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSumCheck(int[] nums) {

        List<List<Integer>> big = new ArrayList();
        List<Integer> small = new ArrayList();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i == 0 || nums[i] > nums[i - 1]) {
                int k = nums.length - 1;
                int j = i + 1;
                //int target=0;
                int result = nums[j] + nums[k] + nums[i];
                while (j < k)
                    if (result < 0) {
                        int currentj = j;
                        while (nums[j] == nums[currentj] && j < k) {
                            j++;
                        }
                    }
                if (result > 0) {
                    int currentk = k;
                    while (nums[k] == nums[currentk] && j < k) {
                        k--;
                    }
                }
                if (result == 0) {
                    small.add(nums[i]);
                    small.add(nums[j]);
                    small.add(nums[k]);
                    big.add(small);
                    j++;
                    k--;
                }

            }
        }
        return big;
    }
    public static void main(String[] args) {

        ThreeSum threeSum=new ThreeSum();
        int [] nums={-1, 0, 1, 2, -1, -4};
        threeSum.threeSumCheck(nums);
    }

}