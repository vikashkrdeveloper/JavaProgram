public class find_factorial_using_loop {
    public static void main(String[] args) {
        int num=5;
        int factorial=1;
        for (int i=1; i<=num; i++){
    factorial*=i;
        }
        System.out.println(factorial);
    }
}
