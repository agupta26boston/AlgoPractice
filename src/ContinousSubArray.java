public class ContinousSubArray {

    public int subarraySum(int[] nums, int k)
    {
        int arrcount=0;

        for (int i=0;i<nums.length;i++)
        {
            int count=0;
            for (int j=i;j<nums.length;j++)
            {
                count+=nums[j];
                if(count==k)
                {
                    arrcount++;
                }
            }
        }
        System.out.println(" "+arrcount);
        return arrcount;
    }




    public static void main(String[] args) {

        ContinousSubArray continousSubArray=new ContinousSubArray();
        int [] nums={-1,-1,1};
        continousSubArray.subarraySum(nums,0);
    }

}
