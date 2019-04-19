public class Single {


    public int singleNumber(int[] nums) {


        int res=0;

        for (int i=0;i<nums.length;i++)
        {
            int count=0;
            for (int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count==1)
                res=nums[i];
        }
        return res;
    }


    public static void main(String[] args) {

        Single sing = new Single();
        int []nums= {2,2,1};
        sing.singleNumber(nums);

    }
}
