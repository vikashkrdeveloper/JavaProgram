import java.util.Scanner;

public class Array_passed_method {
    static void Arraymethod(int []arr){
        for (int i=0; i<arr.length; i++){
            Scanner sc=new Scanner(System.in);
            System.out.printf("Enter the number array index [%d]",i);
            int num=sc.nextInt();
            arr[i]=num;

        }
    }
    public static void main(String[] args) {
        int []array=new int[5];
        Arraymethod(array);
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
