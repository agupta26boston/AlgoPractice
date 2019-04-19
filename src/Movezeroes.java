import java.util.Arrays;

public class Movezeroes {


    public void moveZeroes(int[] nums) {

//
//        int j=nums.length-1;
//        for (int i=0;i<nums.length-1; i++)
//        {
//            if (nums[i]==0)
//            {
//                int temp=nums[j];
//                nums[j]=nums[i];
//                nums[i]=temp;
//                j--;
//            }
//        }




         //   Arrays.sort(nums);


            int j=0;
            for (int i=0;i<nums.length-1;i++)
            {
                if (nums[i]!=0 )
                {
                    nums[j]=nums[i];
                    j++;
                }
            }
        }


    public static void main(String[] args) {

        Movezeroes mv= new Movezeroes();
        int nums []={0,1,0,3,12};
        mv.moveZeroes(nums);


    }
}
