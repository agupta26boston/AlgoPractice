import java.util.Arrays;

public class ShortestSubArr {


        public int findUnsortedSubarray(int[] nums)
        {

            int n = nums.length;
            int start=0;
            int end=0;


            int [] sorted=Arrays.copyOf(nums,n);
            Arrays.sort(sorted);

            if (Arrays.equals(nums,sorted))
            {
                return 0;
            }

            for (int i=0;i<n-1;i++)
            {
                if(nums[i]!=sorted[i]);
                {
                    start=i;
                    break;
                }
            }
            for (int j=n-1;j>0;j--)
            {
                if(nums[j]!=sorted[j])
                {
                    end=j+1;
                    break;
                }
            }
            return end-start;
        }

    public static void main(String[] args) {

        ShortestSubArr shortestSubArr= new ShortestSubArr();
        int[] nums={2,6,4,8,10,9,15};

       shortestSubArr.findUnsortedSubarray(nums);

    }

}
