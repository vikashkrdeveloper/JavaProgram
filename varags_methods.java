public class varags_methods {
    static int varags(int ...arr){//varags are multiple arguments store to the one array
        int sum=0;
        for (int i:arr){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(varags(34,32));
        System.out.println(varags(4,5,2,4,3));
    }
}
