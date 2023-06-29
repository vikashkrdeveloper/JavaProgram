import java.util.Scanner;
public class inhanes_switch_case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int num=sc.nextInt();
        switch (num){
            case 1 -> System.out.println("Sunday");
            case 2-> System.out.println("Monday");
            case 3-> System.out.println("Tuesday");
            case 4-> System.out.println("Wednesday");
            case 5-> System.out.println("Thursday");
            case 6-> System.out.println("Friday");
            case 7-> System.out.println("Saturday");
            default -> System.out.println("your entered number is high please enter your low number");
        }
    }
}
