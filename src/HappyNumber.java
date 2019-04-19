public class HappyNumber {

    public boolean isHappy(int n)
    {
        int value=0;
        while(n!=1)
        {

            int res=n%10;
            value+=res*res;
            n=n/10;
            if(n==0){
                n=value;
                value=0;
            }

        }

        if (n==1)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        HappyNumber happyNumber= new HappyNumber();
        happyNumber.isHappy(2);
    }
    }
