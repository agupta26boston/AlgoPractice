import java.util.*;

public class DisappearedNumbers {


    public List<Integer> findDisappearedNumbers(int[] nums)
    {

        int n = nums.length;
        Arrays.sort(nums);
        int count =0;
        int mapcount=1;

        List<Integer> resList= new ArrayList();

        HashMap<Integer,Integer> hashMap= new HashMap<>();


        for (int i=1;i<=nums.length;i++)
        {

            hashMap.put(i,mapcount);

//            if(nums[i]==nums[i+1])
//            {
//                count++;
//            }

        }

        for (int i=0;i<=nums.length-1;i++)
        {
            if(!hashMap.containsKey(nums[i]))
            {
                hashMap.put(nums[i],mapcount);
            }
            else
            {
                hashMap.put(nums[i],mapcount+1);
            }

        }


            for (Map.Entry<Integer,Integer> entry:hashMap.entrySet())
        {
            if(entry.getValue()==1)
            {
                resList.add(entry.getKey());
            }
        }

//        for (int i=n-1;i>0;i--)
//        {
//            if (nums[i]-nums[i-1]>count)
//            {
//                while(count!=0)
//                {
//                    resList.add(nums[i]-count);
//                    count--;
//                }
//
//            }
//        }
        for (int k: resList)
        {
            System.out.println("" +k);
        }
        return resList;
    }




    public static void main(String[] args) {

        DisappearedNumbers disappearedNumbers=new DisappearedNumbers();
       // int[] intArray = {4,3 ,2,7,8,2,3,1};
        int[] intArray = {1,1};
        disappearedNumbers.findDisappearedNumbers(intArray);

    }
}
