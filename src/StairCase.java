public class StairCase {


        public int climbStairs(int n) {
            if (n == 0 || n == 1 || n == 2) return n;
            int sum = 2, prev = 1, curr = 0;
            for (int i = 2; i < n; i++) {
                curr = sum;
                sum += prev;
                prev = curr;
            }
            System.out.println(" "+sum);
            return sum;
        }

    public static void main(String[] args) {
            StairCase stairCase=new StairCase();
            stairCase.climbStairs(5);
    }

}
