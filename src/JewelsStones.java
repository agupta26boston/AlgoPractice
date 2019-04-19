public class JewelsStones
{

    public int numJewelsInStones(String J, String S)

    {


        int count=0;
        for (int i=0;i<S.length();i++)
        {
            for(int j=0;j<J.length();j++) {
                if (S.charAt(i)==(J.charAt(j))) {
                    count++;
                }

            }
        }
        System.out.println(" "+count);
        return count;

    }




    public static void main(String[] args) {

        JewelsStones js= new JewelsStones();
        js.numJewelsInStones("aA","aAAbbBBB");

    }



}
