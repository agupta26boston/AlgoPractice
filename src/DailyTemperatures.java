import java.util.Stack;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();

                res[index] = i - index;
            }
            stack.push(i);
        }

        for (int i:res
             ) {
            System.out.println(" "+ i);
        }
        return res;
    }

    public static void main(String[] args) {
        DailyTemperatures dailyTemperatures=new DailyTemperatures();
        int [] temp={73, 74, 75, 71, 69, 72, 76, 73};
        dailyTemperatures.dailyTemperatures(temp);

    }
}
