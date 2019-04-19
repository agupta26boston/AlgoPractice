public class TrailingZeroes {
    public int trailingZeroes(int n) {
    int count=-1;
    double value=1;
    double rem=0;

//        while(n!=1)
//    {
//        value=value*n;
//        n=n-1;
//    }

        value= fact(n);


        while (rem==0)
    {
        rem=value%10;
        value=value/10;
        count++;
    }
    System.out.println(""+count);
        return count;

}
    int fact(int m)
    {
        int result;
        if(m==0 || m==1)
            return 1;

        result = fact(m-1) * m;
        return result;
    }

    public static void main(String[] args) {
        TrailingZeroes trailingZeroes=new TrailingZeroes();
        trailingZeroes.trailingZeroes(30);
    }
}
