import java.util.Scanner;

public class lab_5a1 {
    public static void main(String args[]) {
        int row, col, i, j, k;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows for matrix 1:");
        row = in.nextInt();

        System.out.println("Enter the number columns for matrix 1:");
        col = in.nextInt();

        System.out.println("Enter the number of rows for matrix 2:");
        row = in.nextInt();

        System.out.println("Enter the number columns for matrix 2:");
        col = in.nextInt();

        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int res[][] = new int[row][col];

        System.out.println("Enter the elements of matrix1");

        for (i = 0; i < row; i++) {

            for (j = 0; j < col; j++)
                mat1[i][j] = in.nextInt();

            System.out.println();
        }
        System.out.println("Enter the elements of matrix2");

        for (i = 0; i < row; i++) {

            for (j = 0; j < col; j++)
                mat2[i][j] = in.nextInt();

            System.out.println();
        }

        for (i = 0; i < row; i++)
            for (j = 0; j < col; j++)
                for (k = 0; k < row; k++) {
                    res[i][j] += mat1[i][k] * mat2[k][j];
                }
        System.out.println("multiplication of two matrices:-");

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++)
                System.out.print(res[i][j] + "\t");

            System.out.println();
        }

    }

}
