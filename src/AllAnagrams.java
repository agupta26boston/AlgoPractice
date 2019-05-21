import java.util.ArrayList;
import java.util.List;

public class AllAnagrams {


    public List<Integer> findAnagrams(String s, String p)
    {
        List<Integer> total= new ArrayList<Integer>();
        int slength=s.length();
        int plength=p.length();

        int sum=0;

        int [] text=new int[26];
        int [] pattern= new int[26];

        for(int i=0;i<plength;i++)
        {
            pattern[p.charAt(i)-'a']++;
            text[s.charAt(i)-'a']++;
        }

        for (int j=plength;j<slength;j++)
        {
           if(checkEqual(text,pattern))
           {
               total.add(j-plength);

           }
            text[s.charAt(j)-'a']++;
            text[s.charAt(j-plength)-'a']--;
        }


        return total;
    }

    private boolean checkEqual(int [] nums1,int[] pat1){
        for(int i=0;i<26;i++)
        {
            if(nums1[i]!=pat1[i])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        AllAnagrams allAnagrams=new AllAnagrams();

        allAnagrams.findAnagrams("cbaebabacd", "abc");
    }
//   for (int i=0;i<plength;i++)
//    {
//        sum+=p.charAt(i)-'0';
//    }
//
//
//        for(int k=0;k<slength-plength;k++)
//    {
//        int l=plength;
//        int sum2=0;
//        for (int j=k;l>0;j++)
//        {
//            sum2+=s.charAt(j)-'0';
//            l--;
//        }
//        if(sum==sum2)
//        {
//            total.add(k);
//        }
//    }
}
