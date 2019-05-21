public class Rotate2D {

    public void rotate(int[][] matrix) {

        int j=matrix.length-1;

        for (int i=0;i<j;i++)
        {
            matrix[i][i]=matrix[i][j];

            j--;
        }
    }


    public static void main(String[] args) {
        Rotate2D rotate2D=new Rotate2D();
        int [][] matrix={
                {1,2,3},{4,5,6},{7,8,9}};

        rotate2D.rotate(matrix);
    }

    }

