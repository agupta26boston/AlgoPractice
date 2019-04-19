import java.util.ArrayList;
import java.util.List;

public class AllAnagrams {


    public List<Integer> findAnagrams(String s, String p)
    {
        List<Integer> total= new ArrayList<Integer>();
        int slength=s.length();
        int plength=p.length();

        //  if(plength>slength)
        //        return 0;

        StringBuffer sb= new StringBuffer("");
        char [] check= s.toCharArray();

        for (int i=0;i<check.length-1;i++)
        {
            for (int j=0;j<plength;j++)
            {
                sb.append(check[j]);
            }

            if(p.contains(sb))
            {
                total.add(i);
                sb.setLength(0);
            }
        }
        System.out.println(" "+total);
        return total;
    }

    public static void main(String[] args) {
        AllAnagrams allAnagrams=new AllAnagrams();

        allAnagrams.findAnagrams("abcabc", "abc");
    }

}
