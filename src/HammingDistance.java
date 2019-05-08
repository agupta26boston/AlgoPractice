public class HammingDistance
{

    public int hammingDistance(int x, int y) {
        int n = x^y;
        int result = 0;
        while (n > 0) {
            if (n % 2 != 0) result++;
            n = n / 2;
        }
        System.out.println(" "+result);
        return result;
    }

    public static void main(String[] args) {
        HammingDistance hammingDistance=new HammingDistance();
        hammingDistance.hammingDistance(4,1);
    }
    }

