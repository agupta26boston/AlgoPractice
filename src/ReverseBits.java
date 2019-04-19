import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseBits {
    public int reverseBits(int n)
    {
        int [] res= new int[32];
        for (int i=0;i<32;i++)
        {
            res[i]=n%10;
        }
        System.out.println(Arrays.toString(res));
        return 0;
    }
    public static void main(String[] args)
    {
        ReverseBits reverseBits=new ReverseBits();
        reverseBits.reverseBits(100000010);
    }
}
