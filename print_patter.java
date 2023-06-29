public class print_patter {
    public static void main(String[] args) {
        int num=5;
        for (int i=num; i>=0; i--){
            for (int j=0; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}