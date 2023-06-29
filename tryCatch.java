
public class tryCatch {
    public static void main(String[] args) {
        int a=9000;
        int b=0;
        try {

            int c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Your program to fail resion : "+e);
        }
    }
}
