import java.util.HashMap;

public class Twosum {

    private int [] sum(int [] numbers,int target)
    {
        int n= numbers.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(target-numbers[i]))
            {
                int j=hm.get(target-numbers[i]);
                return new int[]{i,j};
            }
            hm.put(numbers[i],i);
        }
        return new int[]{0,0};
    }


    public static void main(String[] args) {

        Twosum twosum=new Twosum();
        int []nums={2,7,11,15};
        int[] result=twosum.sum(nums,9);

        for (int i:result) {
            System.out.println(" " +i);
        }
    }
}