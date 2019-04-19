public class KayakTest {

    int firstCountEnd=0;
    boolean flag=false; // to check if the count function has been called more than once
    void countUp(int start, int end)
    {
       // int result=end-start;
        if(end>=start) {
            System.out.println("" + start);
            countUp(start + 1, end);//recursive function call
        }
        flag=true;
        firstCountEnd=end;
    }

    void countUpAndDown(int start, int end){

       // int temp=end-start;
        if(flag==true &&firstCountEnd<end) {
            countUp(firstCountEnd , end);
            end=end-1;
        }
        else
        {
            countUp(start, end);
            end=end-1;
        }
        if (end>=start)
        {
            System.out.println(""+ end);
            countUpAndDown(start,end-1);
        }
    }
    public static void main(String[] args) {

        KayakTest kayakTest=new KayakTest();
      // kayakTest.countUp(0,5);
       kayakTest.countUpAndDown(0,10);
    }
}
