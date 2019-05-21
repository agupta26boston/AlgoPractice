public class ShortestSubArray {

    public int findUnsortedSubarray(int[] nums)
    {

        int start=0;
        int end=0;

        int n=nums.length;

        for (int i=0;i<n-1;i++)
        {
            if (nums[i]>nums[i+1])
            {
                start=i;
            }
        }
        for (int j=n-1;j>0;j--)
        {
            if(nums[j]<nums[j-1])
            {
                end=j;
            }
        }
        return end-start;
    }


    public static void main(String[] args) {
    ShortestSubArray shortestSubArray=new ShortestSubArray();
    int [] nums={2,6,4,8,10,9,15};
    shortestSubArray.findUnsortedSubarray(nums);
    }
}
