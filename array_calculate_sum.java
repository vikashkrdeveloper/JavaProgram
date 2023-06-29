import java.util.Scanner;

public class array_calculate_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to inisalize array");
        int num= sc.nextInt();
        float sum=0;
        float []arr=new float[num];
        for (int i=0;i<arr.length; i++){
            Scanner input =new Scanner(System.in);
            System.out.printf("Enter the number array index [%d] : ",i);
            float array_input= input.nextFloat();
            arr[i]=array_input;
        }
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];

        }
        System.out.println("The sum of all array element = "+sum);
    }
}
