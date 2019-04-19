import java.util.Arrays;

public class Anagram {


    public boolean isAnagram(String s, String t) {

        if(s.equalsIgnoreCase("") && t.equalsIgnoreCase(""))
        {
            return true;
        }

        char [] arr1=s.toCharArray();
        char [] arr2=t.toCharArray();

        if(arr1.length!=arr2.length)
        {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i=0;i<=arr1.length-1;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {


  Anagram anagram= new Anagram();
  anagram.isAnagram("a","a");

    }
}
