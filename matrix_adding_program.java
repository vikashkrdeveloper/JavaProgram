import java.util.Scanner;

public class matrix_adding_program {
    public static void main(String[] args) {
        int [][]matrices=new int[2][3];
        int [][]matrices2=new int[2][3];
        for (int i=0; i<matrices.length; i++) {
            for (int j=0; j<3; j++) {
                Scanner sc = new Scanner(System.in);
                System.out.printf("Enter the of array index [%d] [%d] ", i, j);
                int num = sc.nextInt();
                matrices[i][j]=num;

            }

        }
        for (int i=0; i<matrices2.length; i++) {
            for (int j=0; j<3; j++) {
                Scanner sc = new Scanner(System.in);
                System.out.printf("Enter the of array index [%d] [%d] ", i, j);
                int num = sc.nextInt();
                matrices2[i][j]=num;

            }

        }


        System.out.println("Array first ");
        for (int i=0; i<matrices.length; i++){
            for (int j =0; j<3; j++){
                System.out.printf("%d\t",matrices[i][j]);
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Array second ");
        for (int i=0; i<matrices.length; i++){
            for (int j =0; j<3; j++){
                System.out.printf("%d\t",matrices2[i][j]);
            }
            System.out.println();
        }
        System.out.println();


        int [][]adding=new int[2][3];
//        matrix addition of two matrices
        System.out.println("Two array adding ");
        for (int i=0; i<matrices.length; i++){
            for (int j =0; j<3; j++){
                adding[i][j]=matrices[i][j]+matrices2[i][j];
                System.out.printf("%d\t",adding[i][j]);
            }
            System.out.println();
        }


    }
}
