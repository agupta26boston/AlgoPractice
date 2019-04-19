import java.util.Arrays;

public class ShortestSubArr {


        public int findUnsortedSubarray(int[] nums)
        {
            int n = nums.length;
            int start=0;
            int end=0;
            int max=0;
            int min=0;

             int [] sorted=Arrays.copyOf(nums,n);
             Arrays.sort(sorted);

            if (Arrays.equals(nums,sorted))
            {
                return 0;
            }

            for (int i=0;i<n;i++)
            {
                if (nums[i]!=sorted[i])
                {
                    start=i;
                    break;
                }

            }
            for (int j=n-1;j>0;j--)
            {
                if(nums[j]!=sorted[j]) {
                    end = j;
                    break;
                }
            }
//            for (int i=0;i<n-1;i++)
//            {
//
//
//                if (nums[i]>nums[i+1])
//                {
//                    start=i;
//                    break;
//                }
//            }
//
//            for (int j=n-1;j>0;j--)
//            {
//                if(nums[j]<nums[j-1])
//                {
//                    end=j;
//                    break;
//                }
//            }
//            max=nums[start];
//            min=nums[start];
//            for (int i=start+1; i<=end;i++)
//            {
//
//                if(nums[i]<min)
//                {
//                    min=nums[i];
//                }
//
//                if(nums[i]>max)
//                {
//                    max=nums[i];
//                }
//            }

//            for (int i=0;i<start;i++)
//            {
//                if(nums[i]>min)
//                {
//                    start=i;
//                    break;
//                }
//
//            }
//
//            for (int i=n-1;i>end+1;i--)
//            {
//                if(nums[i]<max)
//                {
//                    end=i;
//                }
//            }


            return end-start;
        }

    public static void main(String[] args) {

        ShortestSubArr shortestSubArr= new ShortestSubArr();
        int[] nums={2,6,4,8,10,9,5};

       shortestSubArr.findUnsortedSubarray(nums);

    }

}
