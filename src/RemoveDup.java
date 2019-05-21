//import java.util.HashMap;
//
//public class RemoveDup {
//    HashMap<Integer,Integer> hashMap= new HashMap<>();
//
//    private int [] removeDup(int [] nums)
//    {
//
//
////        for(int i=0;i<nums.length;i++)
////        {
////            if (hashMap.containsKey(nums[i])) {
////                hashMap.put(nums[i],hashMap.get(nums[i])+1);
////            }
////            else
////            {
////                hashMap.put(nums[i],1);
////            }
////
////        }
////        int k=0;
////
////        for (int j=0;j<n;j++)
////        {
////            if (hashMap.get(nums[j]).intValue()>1)
////            {
////                nums[k++]=nums[j];
////                nums[j]=nums[nums.length-1];
////                n--;
////            }
////            else
////            {
////                nums[k]=nums[j];
////            }
////        }
////        for (int m:nums) {
////            System.out.println("" +m);
////        }
////        return nums;
//  //  }
//
//    public static void main(String[] args) {
//        RemoveDup removeDup=new RemoveDup();
//
//        int [] arr={1,1,2,3,3,4,4};
//
//        removeDup.removeDup(arr);
//
//    }
//}
