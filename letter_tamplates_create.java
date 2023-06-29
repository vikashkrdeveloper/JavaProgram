import java.util.Scanner;
public class letter_tamplates_create {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String letters=sc.nextLine();
        System.out.println("Dear "+letters+","+"\n"+"Thanks "+letters);
//        indexof method

        String str="vikash kumar";
        int d=str.indexOf(" ");
        System.out.println(d);

    }
}
