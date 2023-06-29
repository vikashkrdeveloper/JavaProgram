import java.util.Scanner;

public class multidimention_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of arry inislazation ");
        int num= sc.nextInt();
        int [][]matrix=new int[num][num];
        for (int i=0; i<matrix.length; i++){
            for (int j =0; j<matrix.length; j++) {
                Scanner input = new Scanner(System.in);
                System.out.printf("enter the number of array index [%d][%d]", i,j);
                int array_input = input.nextInt();
                matrix[i][j]=array_input;
            }
        }
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix.length; j++){
                System.out.printf("%d\t",matrix[i][j]);
            }

            System.out.println();
        }
    }
}
