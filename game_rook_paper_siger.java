import java.util.Random;
import java.util.Scanner;

public class game_rook_paper_siger {
    public static void main(String[] args) {
        Random render=new Random();
       int rand= render.nextInt(3);
        Scanner  input=new Scanner(System.in);
        System.out.println("your input for rook 0 paper 1  scissor 2");
        int userinput=input.nextInt();
        if (userinput>2){
            System.out.println("your number is high please enter low number game require mostly three numbers first number 0 " +
                    "for rook and second 1 for paper third 2 for scissor");
            System.out.println("computer winner");

        }
        else if (rand==userinput){
            System.out.println("Game drow");
        }
        else if (userinput==0&&rand==2||userinput==1&&rand==0||userinput==2&&rand==1){
            System.out.println("you winner");
        }
        else{
            System.out.println("computer winner");
        }
        System.out.println("Computer choice : "+rand);

    }
}
