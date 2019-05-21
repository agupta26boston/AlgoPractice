import java.util.ArrayList;
import java.util.List;

public class Subset {
    List<List<Integer>> big=new ArrayList<>();

    List<Integer> small= new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums)
    {
        addsub(nums,0,nums.length);

        return big;
    }

    public void addsub(int [] arr,int start,int end)
    {
        if(end!=0)
        {
            for (int i=start;i<end;i++)
            {
                small.add(arr[i]);
            }
            big.add(small);
            addsub(arr,start,end-1);
        }
    }
    public static void main(String[] args) {
        Subset subset=new Subset();
        int [] nums={1,2,3};
        subset.subsets(nums);

    }
}
