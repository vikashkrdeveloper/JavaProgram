import java.util.Random;
import java.util.Scanner;

public class gessing_the_number {
        public static void main(String[] args) {
                Random rand=new Random();
                int Computer=rand.nextInt(100);
                int count;
                int i=0;

            do {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the number for gasses the number");
                    int userInput = sc.nextInt();
                    if (userInput>Computer){
                            System.out.println("Enter the lower number pleased...");
                    }
                    else if (userInput<Computer) {
                            System.out.println("Enter the higher number pleased...");
                    }
                    else{
                            System.out.println("you gasses the number "+i+" attemts");
                    }
                    i++;
                    count=userInput;
            }while (count!=Computer);
        }



}
