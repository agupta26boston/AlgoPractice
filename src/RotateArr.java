public class RotateArr {

    public void rotate(int[] nums, int k)
    {
        int [] result= new int [nums.length];
        int n =nums.length;
        int j=0;
        for (int i=n-k-1;i<n;i++)
        {
            result[j]=nums[i];
            j++;
        }

        for (int i=0;i<k;i++)
        {
            result[j]=nums[i];
            j++;
        }

        nums=result;
        for (int l:result
                ) {
            System.out.println(" " +l);
        }
    }

    public static void main(String[] args) {
        RotateArr rotateArr=new RotateArr();
        int [] hi={1,2,3,4,5,6,7};
        rotateArr.rotate(hi,3);
    }
}
