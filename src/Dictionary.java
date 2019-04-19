import java.util.ArrayList;

public class Dictionary {


    private String [] check(String s)
    {
        ArrayList<String> result= new ArrayList<>();

            String s1 = checkNoun(s);
            if(s1!=null) {
                result.add(s1);
        }
        String s2=checkVerb(s);
        if(s2!=null) {
            result.add(s2);
        }
        String s3=checkVerb(s);
        if(s3!=null) {
            result.add(s3);
        }

        for (String ss: result
             ) {
            System.out.println(" " +ss);
        }
        return null;
    }

    private String checkNoun(String s)
    {

        String [] nouns={"abcd","c","def","h","ij","cde"};

        for (int i=0;i<nouns.length;i++)
        {
            if (s.equals(nouns[i]))
            {
                return nouns[i];
            }
        }
        return null;
    }
    private String checkVerb(String s)
    {
        String [] verbs={"bc","fg","g","hij","bcd"};

        return null;
    }
    private String checkArticle(String s)
    {
        String [] nouns={"a","ac","e"};
        return null;
    }

    public static void main(String[] args) {


        Dictionary dictionary= new Dictionary();
        dictionary.check("abcd");

    }
}
