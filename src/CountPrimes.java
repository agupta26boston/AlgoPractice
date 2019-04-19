import java.util.Arrays;

public class CountPrimes
{

    private int countPrimes(int n)
    {
        int i=2;
        int count=0;

        boolean [] countP=new boolean[n];
        Arrays.fill(countP,true);

        while (i<n)
        {
            if(countP[i])
            {
                count++;
                for (int j = 2; i * j < n; j++)
                {
                    countP[i * j] = false;
                }
            }
            i++;
        }
        System.out.println(" "+count);
return count;
    }




    public static void main(String[] args) {
        CountPrimes countPrimes=new CountPrimes();
        countPrimes.countPrimes(10);

    }

}
