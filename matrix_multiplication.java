import java.util.Scanner;

public class matrix_multiplication {
    public static void main(String[] args) {
        int [][]matrix1=new int[3][3];
        int [][]matrix2=new int[3][3];
        int [][]multiplication=new int[3][3];
        for (int i=0; i<matrix1.length; i++){
            for (int j=0; j<matrix1.length; j++){
                Scanner sc=new Scanner(System.in);
                System.out.printf("Enter the number of index [%d] [%d] : ",i,j);
                int num=sc.nextInt();
                matrix1[i][j]=num;

            }
        }

        for (int i=0; i<matrix2.length; i++){
            for (int j=0; j<matrix2.length; j++){
                Scanner sc=new Scanner(System.in);
                System.out.printf("Enter the number of index [%d] [%d] : ",i,j);
                int num=sc.nextInt();
                matrix2[i][j]=num;

            }
        }
        System.out.println("First array of matrix");
        for (int i=0; i<matrix1.length; i++){
            for (int j=0; j<matrix1.length; j++){
                System.out.printf("%d\t",matrix1[i][j]);

            }
            System.out.println();
        }


        System.out.println("Second array of matrix");
        for (int i=0; i<matrix2.length; i++){
            for (int j=0; j<matrix2.length; j++){
                System.out.printf("%d\t",matrix2[i][j]);

            }
            System.out.println();
        }


        System.out.println("Multiplication of two matrix");
        for (int i=0; i<multiplication.length; i++){
            for (int j=0; j<multiplication.length; j++){
              multiplication[i][j]=matrix1[i][j]*matrix2[i][j];
                System.out.printf("%d\t",multiplication[i][j]);
            }
            System.out.println();
        }
    }
}
