import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrIntersection
{

    public int[] intersect(int[] nums1, int[] nums2)

    {
        int n1=nums1.length;
        int n2=nums2.length;
       // ArrayList result= new ArrayList();

        if (n1>n2)
        {
            ArrayList result= new ArrayList();
            for (int i=0;i<n2;i++)
            {
                for (int j=0;j<n1;j++)
                {
                    if(nums2[i]==nums1[j])
                    {
                        result.add(nums2[i]);
                        break;
                    }

                }
            }
            return finresult(result);
        }

        else
        {
            ArrayList result2= new ArrayList();
            for (int i=0;i<n1;i++)
            {
                for (int j=0;j<n2;j++)
                {
                    if(nums1[i]==nums2[j])
                    {
                        result2.add(nums1[i]);
                        break;
                    }

                }
            }
            return finresult(result2);
        }



    }
    private int [] finresult(List<Integer> result)
    {
        int [] convertarr= new int [result.size()];

        for (int i=0;i<result.size();i++)
        {
            convertarr [i]=result.get(i);
        }
        return convertarr;
    }

    public static void main(String[] args) {

 ArrIntersection arrIntersection= new ArrIntersection();
 int[] nums1={4,9,5};
 int[] nums2={9,4,9,8,4};
 arrIntersection.intersect(nums1,nums2);

    }
}
