public class SubArraydivisibleByk
{

    // Handles all the cases
    // function to find all sub-arrays divisible by k
    // modified to handle negative numbers as well
    static int subCount(int arr[], int k)
    {

        int n=arr.length;
        // create auxiliary hash array to
        // count frequency of remainders
        int mod[] = new int[k];

        // Traverse original array and compute cumulative
        // sum take remainder of this current cumulative
        // sum and increase count by 1 for this remainder
        // in mod[] array
        int cumSum = 0;
        for (int i = 0; i < n; i++) {
            cumSum += arr[i];

            // as the sum can be negative, taking modulo twice
            mod[((cumSum % k) + k) % k]++;
        }

        // Initialize result
        int result = 0;

        // Traverse mod[]
        for (int i = 0; i < k; i++)

            // If there are more than one prefix subarrays
            // with a particular mod value.
            if (mod[i] > 1)
                result += (mod[i] * (mod[i] - 1)) / 2;

        // add the elements which are divisible by k itself
        // i.e., the elements whose sum = 0
        result += mod[0];

        System.out.println(" "+result);
        return result;
    }

    static long kSub( int[] nums,int k) {

        int [] sum = new int[nums.length];
        long count = 0;
        sum[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            sum[i] = sum[i-1] + nums[i];
        }

        int [] kVal = new int[k];

        for(int i = 0; i < sum.length; i++){
            int mod = sum[i] % k;

            if(mod == 0)
                count++;

            count += kVal[mod];
            kVal[mod] += 1;

        }
        System.out.println(" "+count);
        return count;
    }

    static int countDivisibleSubseq(int [] str, int n) {
        int len = str.length;

        // remainder j after division by n.
    int dp[][] = new int[len][n];

    // Filling value for first digit in str
    dp[0][(str[0]) % n]++;

        for (int i = 1; i < len; i++) {
    // start a new subsequence with index i
    dp[i][(str[i]) % n]++;

    for (int j = 0; j < n; j++) {
        // exclude i'th character from all the
        // current subsequences of string [0...i-1]
        dp[i][j] += dp[i - 1][j];

        // include i'th character in all the current
        // subsequences of string [0...i-1]
        dp[i][(j * 10 + (str[i])) % n] += dp[i - 1][j];
    }
}

System.out.println(" " +dp[len - 1][0]);
        return dp[len - 1][0];
}

    public static void main(String[] args) {

        SubArraydivisibleByk continousSubArray=new SubArraydivisibleByk();
        int [] nums={5,10,3,10,3};
     //   subCount(nums,5);
      // kSub(nums,5);

        countDivisibleSubseq(nums,5);
    }
}
