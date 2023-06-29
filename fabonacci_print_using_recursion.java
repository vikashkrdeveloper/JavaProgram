public class fabonacci_print_using_recursion {
    static int fabonacci(int num){
        if (num==0){
            return 0;
        }
        else if (num==1){
            return 1;
        }
        else{
            return fabonacci(num-1)+fabonacci(num-2);
        }
    }
    public static void main(String[] args) {
        int num=5;
        for (int i=0; i<num; i++){
            System.out.println(fabonacci(i));

        }
    }
}
