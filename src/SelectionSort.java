public class SelectionSort {

    private void sort(int [] arr)
    {
        int min=Integer.MIN_VALUE;

        for (int i=0;i<2;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]>arr[j])
                {
                    min=arr[j];
                    arr[j]=arr[i];
                    arr[i]=min;

                }
            }
        }
        for (int i:
             arr) {
            System.out.println("" + i);
        }
    }



    public static void main(String[] args) {

        SelectionSort selectionSort= new SelectionSort();
        int[] nums={2,6,4,8,10,9,5,13,8,0,4,2};

        selectionSort.sort(nums);

    }

}
