public class swap_two_numbers {

    static void names(int a ,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);

    }
    public static void main(String[] args) {
        int a=34;
        int b=6;
        System.out.println("before method calling ");
        names(a,b);
        System.out.println("After method calling ");
        System.out.println(a);
        System.out.println(b);

    }
}
