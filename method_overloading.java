public class method_overloading {
    static void method_overloading(){
        System.out.println("hello vikash kumar you write this code to method overloading");
    }
    static int method_overloading(int a){
        int c;
        c=a;
        return a;
    }
    static int method_overloading(int a,int b){
        int c;
        c=a+b;
        return c;
    }
    static int method_overloading(int a,int b,int c){
        int d;
        d=a+b+c;
        return d;

    }
    static int method_overloading(int a,int b,int c,int d){
        int e;
        e=a+b+c+d;
        return e;
    }
    public static void main(String[] args) {
        int a=23,b=45,c=57,d=90;
        method_overloading();
        System.out.println(method_overloading(a));
        System.out.println(method_overloading(a,b));
        System.out.println(method_overloading(a,b,c));
        System.out.println(method_overloading(a,b,c,d));
    }
}
