package Matrix;
public class Matrix_Multi {

    public static void main(String[] args) {
       int mat[][]={{1,2},{3,4}};
        int mat1[][]={{4,5},{9,8}};
        int arr[][]=new int[2][2];
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<2;j++){
                int sum=0;
                for (int k=0;k<2;k++){
                      sum+=mat[i][k]*mat1[k][j];
                }
                arr[i][j]=sum;
            }
        }
         for (int i=0;i<mat.length;i++){
            for (int j=0;j<2;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}