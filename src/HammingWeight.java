public class HammingWeight {

    public int hammingWeight(int n)
    {
        //double o=n;
        if(n==0)
        {
            return 0;
        }
        int result=1;
        while(n>0)
        {
            if(n%10!=0)
            {
                result++;
            }
            n=n/10;
        }
        System.out.println("" +result);
        return result;
    }
    public static void main(String[] args) {
        HammingWeight hammingWeight=new HammingWeight();
        hammingWeight.hammingWeight(0000000010000000);
    }

    }

