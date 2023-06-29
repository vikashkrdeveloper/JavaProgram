public class maximum_number_find {
    public static void main(String[] args) {
        int []arr={23,4,5,66,77,83,92};
        int max=Integer.MIN_VALUE;
        for (int i:arr
             ) {
            if (max<i){
                max=i;
            }
        }
        System.out.println(max);
    }
}
