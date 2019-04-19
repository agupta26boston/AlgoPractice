import java.util.Arrays;

public class MinStack {

        int small=Integer.MAX_VALUE;
        int prevsmall=small;
        int index=0;
        int [] minarr;
        /** initialize your data structure here. */
        public MinStack() {
            minarr= new int [10];
        }

        public void resize(int capacity)
        {

            minarr= Arrays.copyOf(minarr,capacity);


        }

        public void push(int x) {


            if (x<small)
            {
                prevsmall=small;
                small=x;
            }
            if (minarr[index]==minarr[minarr.length-1])
            {
                resize(minarr.length*2);
            }
            minarr[index]=x;
            index++;
        }

        public void pop()
        {
            if (small==minarr[index-1])
            {
                small=prevsmall;
            }
            minarr[index-1]=0;
            index--;
        }

        public int top()
        {
            return minarr[index];
        }

        public int getMin()
        {
            return small;
        }

    public static void main(String[] args) {
            MinStack minStack=new MinStack();
            minStack.push(10);
        minStack.push(10);
        minStack.push(10);
        minStack.push(10);
        minStack.push(10);
        minStack.push(10);
        minStack.push(10);
        minStack.push(10);
        minStack.push(10);
        minStack.push(10);
        minStack.push(10);
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
