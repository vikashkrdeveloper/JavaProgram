import java.util.Scanner;
public class if_else_statement {
    public static void main(String[] args) {
        int marks;
        System.out.println("enter your marks chemistry");
        Scanner sc=new Scanner(System.in);
        marks=sc.nextInt();
        int marks1;
        System.out.println("enter your marks physics");
        Scanner sc1=new Scanner(System.in);
        marks1=sc1.nextInt();
        int marks2;
        System.out.println("enter your marks mathematics");
        Scanner sc2=new Scanner(System.in);
        marks2=sc2.nextInt();
        float avrage=(marks1+marks2+marks)/3.0f;
        if (avrage>30&&marks>30&&marks1>30&&marks2>30){
            System.out.println("you are passed for all subject");
        }
        else{
            System.out.println("you are fail");
        }

    }
}
