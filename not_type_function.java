public class not_type_function{
    static void  vkz(int a,int b){

        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        int a=2;
        int  b=5;
   vkz(a,b);
        System.out.println(a);
        System.out.println(b);
    }
}
