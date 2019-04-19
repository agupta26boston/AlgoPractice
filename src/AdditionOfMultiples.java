public class AdditionOfMultiples {

    public int addition(int n){
        int result=0;

        for (int i=1;i<n;i++)
        {
            if(i%3==0 || i%5==0)
            {
                result+=i;
            }
        }
        System.out.println(" "+result);
        return result;
    }



    public static void main(String[] args) {

        AdditionOfMultiples additionofmultiples=new AdditionOfMultiples();
        additionofmultiples.addition(1000);
    }

}
