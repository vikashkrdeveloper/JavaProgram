import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Array create in memory allocation");
        int num=sc.nextInt();

//        wrong way declare in Array
//        int marks[]=new int[num];

//        wright way to declare to an Array
        int []marks=new int[num];

        for (int i=0; i<marks.length; i++){

            Scanner input=new Scanner(System.in);
            System.out.printf("Enter the number Array [%d] index : ",i);
            int array_input= input.nextInt();
            marks[i]=array_input;
        }
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}