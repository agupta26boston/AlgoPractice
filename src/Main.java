import java.lang.reflect.Array;

public class Main {



    public int[] sortedSquares(int[] A) {

        int len = A.length;



        for (int i = 0; i < len - 1; i++) {
            A[i] *= A[i];

        }

        for (int i = 0; i < len-1 ; i++) {
            for (int j=0;j<len-1-i;j++) {
                if (A[j] > A[j+1])
                {
                   int temp = A[j+1];
                    A[j+1] = A[j];
                    A[j] = temp;

                }

            }
        }
        return A;
    }

    private void printArray(int [] A)
    {
        for (int i=0;i<A.length;i++)
        {
            System.out.println( "" + A[i]);
        }
    }

    public static void main(String[] args) {

        Main main= new Main();
        int[] array={-4,-1,0,3,10};
        main.sortedSquares(array);
       main.printArray(array);
    }
}
