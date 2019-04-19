import java.lang.reflect.Array;
import java.util.Arrays;

public class UniqueChStr {


    public int firstUniqChar(String s) {


        if (s.equals(""))
        {
            return -1;
        }


        char [] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=i+1;j<arr.length;j++)
            {

                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                return i;
            }
        }


        return -1;
    }


    //optimized solution

    public int firstUniqCharO(String s) {

        if (s.equals(""))
        {
            return -1;
        }

        char [] arr= new char[256];


        for (int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)]++;
        }

        for(int i=0;i<arr.length;i++) {
            if (arr[s.charAt(i)] == 1);
            return i;
        }
        return -1;
    }




    public static void main(String[] args) {

        UniqueChStr us= new UniqueChStr();
        us.firstUniqCharO("loveleetcode");

    }
}

